package com.example.jobfinder.App.UI.Registration


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
fun CheckEmail(navController: NavController) {

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
            text = "Check Your Email",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            color = Color.Black,
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "We have sent the reset password to the email address brandonelouis@gmial.com",
            fontSize = 12.sp,
            color = Color(0xFF524B6B),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 50.dp)
        )

        Spacer(modifier = Modifier.height(70.dp))
        // Login Button
        CustomButton(
            text = "Open Your Email",
            onClick = {
                navController.navigate("Successfully")
            },
            modifier = Modifier.padding(horizontal = 25.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Back to Login Button
        BackToLoginButton(
            onClick = {
                navController.navigate("LoginScreen"){
                    popUpTo("CheckEmail"){
                        inclusive = true
                    }
                }
            }
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row {
            Text(
                text = "You have not received the email?",
                fontWeight = FontWeight(400),
                fontSize = 12.sp,
            )
            Text(
                text = "Resend",
                fontWeight = FontWeight(400),
                fontSize = 12.sp,
                color = (Color(0xFF3847E5)),
                modifier = Modifier
                    .padding(start = 8.dp)
                    .clickable {
                        //TODO: Add click action
                    }
            )
        }
    }
}
