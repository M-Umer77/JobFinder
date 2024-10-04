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
import com.example.jobfinder.App.Components.Registration.LoginScreenComponent.CustomButton
import com.example.jobfinder.App.Components.Registration.LoginScreenComponent.CustomCheckbox
import com.example.jobfinder.App.Components.Registration.LoginScreenComponent.CustomTextField
import com.example.jobfinder.App.Components.Registration.LoginScreenComponent.GoogleSignInButton
import com.example.jobfinder.R


@Composable
fun LoginScreen(navController: NavController) {
    val checkState = remember { mutableStateOf(false) }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF9F9F9))
    ) {
        Image(
            painterResource(R.drawable.loginlogo),
            contentDescription = "",
            modifier = Modifier.size(90.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Welcome Back",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            color = Color.Black,
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor",
            fontSize = 12.sp,
            color = Color(0xFF524B6B),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 60.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        // Email TextField
        CustomTextField(
            label = "Email",
            value = email,
            onValueChange = { email = it }
        )

        Spacer(modifier = Modifier.height(15.dp))

        // Password TextField
        CustomTextField(
            label = "Password",
            value = password,
            onValueChange = { password = it }
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Checkbox and Forgot Password
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            CustomCheckbox(
                checked = checkState.value,
                onCheckedChange = { checkState.value = it },
                label = "Remember me"
            )
            Text(
                text = "Forgot Password?",
                fontWeight = FontWeight(400),
                fontSize = 12.sp,
                color = (Color(0xFF3847E5)),
                modifier = Modifier
                    .padding(start = 182.dp)
                    .clickable {
                        navController.navigate("ForgotPassword")
                    }
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        // Login Button
        CustomButton(
            text = "Login",
            onClick = {
                navController.navigate("HomeScreen")
            },
            modifier = Modifier.padding(horizontal = 25.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        // Google Sign-In Button
        GoogleSignInButton(
            onClick = { /* TODO: Add click action */ }
        )

        Spacer(modifier = Modifier.height(135.dp))

        Row {
            Text(
                text = "You don't have an account yet?",
                fontWeight = FontWeight(400),
                fontSize = 12.sp,
            )
            Text(
                text = "Sign up",
                fontWeight = FontWeight(400),
                fontSize = 12.sp,
                color = (Color(0xFF3847E5)),
                modifier = Modifier
                    .padding(start = 8.dp)
                    .clickable {
                        navController.navigate("SignUpScreen")
                    }
            )
        }
    }
}
