package com.example.sootheandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sootheandroid.ui.theme.SootheAndroidTheme

@Composable
fun HomeScreen() {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .fillMaxSize()
    ) {
        TextFieldSearch()
        CollectionsAll()
        ClassesAll()
    }
}

@Composable
fun TextFieldSearch() {

}

@Composable
fun CollectionsAll() {

}

@Composable
fun ClassesAll() {

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    SootheAndroidTheme {
        HomeScreen()
    }
}