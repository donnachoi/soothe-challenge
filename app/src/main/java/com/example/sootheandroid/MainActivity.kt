package com.example.sootheandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.sootheandroid.navigation.NavGraph
import com.example.sootheandroid.ui.theme.SootheAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SootheAndroidTheme() {
                val navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}
