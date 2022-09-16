package com.example.sootheandroid.navigation

sealed class NavRoutes(val route: String) {
    object Welcome : NavRoutes("welcome")
    object Login : NavRoutes("login")
}
