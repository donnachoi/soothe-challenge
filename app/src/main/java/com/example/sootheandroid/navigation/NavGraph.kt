package com.example.sootheandroid.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sootheandroid.layout.ButtonLogin
import com.example.sootheandroid.layout.LoginScreen
import com.example.sootheandroid.layout.WelcomeScreen

@Composable
fun NavGraph (
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "welcome")
    {
        composable("welcome"){
            WelcomeScreen(
                navigateToLogin = {navController.navigate("login")}
            )
        }
        composable("login"){
            LoginScreen(navController)
        }
    }
}

