package com.example.jobfinder.App.UI.Registration

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jobfinder.App.UI.Navigation.SharedPrefsHelper
import com.example.jobfinder.R

@Composable
fun OnBoardingScreen(navController: NavController) {
    val context = LocalContext.current
    val sharedPrefsHelper = remember { SharedPrefsHelper(context) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.onbordingimage),
                contentScale = ContentScale.FillBounds
            )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "WELCOME",
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(top = 200.dp)
            )

            Text(
                text = "Find and get job recommendations, search and save your job vacancies",
                fontSize = 16.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 16.dp, bottom = 32.dp)
                    .padding(horizontal = 44.dp)
            )

            Spacer(modifier = Modifier.height(100.dp))

            // Button to navigate to login or other screen based on onboarding completion
            Button(
                onClick = {
                    sharedPrefsHelper.setBoolean("onboarding_complete", true)
                    navController.navigate("LoginScreen") {
                        popUpTo("OnBoardingScreen") { inclusive = true }
                    }
                },
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .width(150.dp)
                    .height(50.dp)
            ) {
                Text(text = "Start", fontSize = 18.sp)
            }
        }
    }
}