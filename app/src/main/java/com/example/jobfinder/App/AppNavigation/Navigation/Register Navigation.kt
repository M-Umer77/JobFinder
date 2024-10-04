package com.example.jobfinder.App.UI.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jobfinder.App.UI.Registration.CheckEmail
import com.example.jobfinder.App.UI.Registration.ForgotPassword
import com.example.jobfinder.App.UI.Registration.LoginScreen
import com.example.jobfinder.App.UI.Registration.OnBoardingScreen
import com.example.jobfinder.App.UI.Registration.SignUpScreen
import com.example.jobfinder.App.UI.Registration.SplashScreen
import com.example.jobfinder.App.UI.Registration.Successfully

@Composable
fun RegistrationScreens() {
    val navigation = rememberNavController()

    NavHost(navController = navigation, startDestination = "SplashScreen") {
        composable("SplashScreen") {
            SplashScreen(navigation)
        }
        composable("OnBoardingScreen") {
            OnBoardingScreen(navigation)
        }
        composable("LoginScreen") {
            LoginScreen(navigation)
        }
        composable("SignUpScreen") {
            SignUpScreen(navigation)
        }
        composable("ForgotPassword") {
            ForgotPassword(navigation)
        }
        composable("CheckEmail") {
            CheckEmail(navigation)
        }
        composable("Successfully") {
            Successfully(navigation)
        }
        composable("LoginScreen") {
            LoginScreen(navigation)
        }
    }
}