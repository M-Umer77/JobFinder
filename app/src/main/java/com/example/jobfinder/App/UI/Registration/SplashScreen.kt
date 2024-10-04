package com.example.jobfinder.App.UI.Registration

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.jobfinder.App.UI.Navigation.SharedPrefsHelper
import com.example.jobfinder.R
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController) {

    val context = LocalContext.current
    val sharedPrefsHelper = remember { SharedPrefsHelper(context) }

    LaunchedEffect(Unit) {
        // Delay to show splash screen before navigating
        delay(3000)

        // Retrieve the onboarding status
        val isOnboardingComplete = sharedPrefsHelper.getBoolean("onboarding_complete", false)

        // Navigate based on the retrieved value
        if (isOnboardingComplete) {
            navController.navigate("LoginScreen") {
                popUpTo("SplashScreen") { inclusive = true }
            }
        } else {
            navController.navigate("OnBoardingScreen") {
                popUpTo("SplashScreen") { inclusive = true }
            }
        }
    }

    // Splash screen UI
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF7E57C2)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "App Logo",
                modifier = Modifier.size(120.dp)
            )
        }
    }
}

