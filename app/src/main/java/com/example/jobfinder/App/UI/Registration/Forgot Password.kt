package com.example.jobfinder.App.UI.Registration


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jobfinder.App.Components.Registration.ForgotPassword.BackToLoginButton
import com.example.jobfinder.App.Components.Registration.LoginScreenComponent.CustomButton
import com.example.jobfinder.App.Components.Registration.LoginScreenComponent.CustomTextField
import com.example.jobfinder.App.Components.Registration.LoginScreenComponent.GoogleSignInButton
import com.example.jobfinder.R


@Composable
fun ForgotPassword(navController: NavController){
    var email by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF9F9F9))
    ) {
        Image(
            painterResource(R.drawable.forgotpassword),
            contentDescription = "",
            modifier = Modifier.size(90.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Forgot Password",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            color = Color.Black,
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "To reset your password, you need your email or mobile number that can be authenticated",
            fontSize = 12.sp,
            color = Color(0xFF524B6B),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 50.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        // Email TextField
        CustomTextField(
            label = "Reset Password",
            value = email,
            onValueChange = { email = it }
        )
        Spacer(modifier = Modifier.height(20.dp))
        // Login Button
        CustomButton(
            text = "Reset Password",
            onClick = {
                navController.navigate("CheckEmail"){
                    popUpTo("ForgotPassword")
                    { inclusive = true }
                }
            },
            modifier = Modifier.padding(horizontal = 25.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Back to Login Button
        BackToLoginButton(
            onClick = {
                navController.navigate("LoginScreen"){
                    popUpTo("ForgotPassword")
                    { inclusive = true }
                }
            }
        )

    }
}
