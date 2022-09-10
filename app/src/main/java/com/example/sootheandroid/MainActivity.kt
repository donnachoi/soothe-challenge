package com.example.sootheandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sootheandroid.ui.theme.SootheAndroidTheme
//import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
//import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
//import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SootheAndroidTheme {
//                val windowSize = calculateWindowSizeClass(this)
//                val uiState = viewModel.uiState.collectAsState().value
                WelcomeScreen()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SootheAndroidTheme {
        Greeting("Android")
    }
}