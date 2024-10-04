package com.example.jobfinder.App.UI.Registration

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.jobfinder.App.Components.Registration.ForgotPassword.BackToLoginButton
import com.example.jobfinder.App.Components.Registration.LoginScreenComponent.CustomButton
import com.example.jobfinder.R


@Composable
fun Successfully(navController: NavController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF9F9F9))
    ) {
        Image(
            painterResource(R.drawable.checkemail),
            contentDescription = "",
            modifier = Modifier.size(90.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Successfully",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            color = Color.Black,
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Your password has been updated, please change your password regularly to avoid this happening",
            fontSize = 12.sp,
            color = Color(0xFF524B6B),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 50.dp)
        )

        Spacer(modifier = Modifier.height(70.dp))
        // Login Button
        CustomButton(
            text = "Continue",
            onClick = {
                navController.navigate("LoginScreen"){
                    popUpTo("Successfully"){
                        inclusive = true
                    }
                }
            },
            modifier = Modifier.padding(horizontal = 25.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Back to Login Button
        BackToLoginButton(
            onClick = {
                navController.navigate("LoginScreen"){
                    popUpTo("Successfully"){
                        inclusive = true
                    }
                }
            }
        )

    }
}
