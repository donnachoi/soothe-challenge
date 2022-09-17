package com.example.sootheandroid.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.sootheandroid.R
import com.example.sootheandroid.ui.theme.SootheAndroidTheme

@Composable
fun HomeScreen() {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column {
            TextFieldSearch()
            CollectionsAll()
            ClassesAll()
        }
    }
}

@Composable
fun TextFieldSearch(
    darkTheme: Boolean = isSystemInDarkTheme()
) {
    val textState = remember { mutableStateOf(TextFieldValue()) }
    val textFieldColors = if (darkTheme) {
        TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White.copy(alpha = .15f)
        )
    } else {
        TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White.copy(alpha = .85f)
        )
    }
    TextField(
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth(0.9f),
        colors = textFieldColors,
        value = textState.value,
        onValueChange = { textState.value = it },
        placeholder = {
            Text(text = "Email address")
        },
    )
}

@Composable
fun CollectionsAll() {
    CollectionsCard()
}

@Composable
fun CollectionsCard() {
    val image: Painter = painterResource(id = R.drawable.login)
    Row(
        modifier = Modifier
            .width(600.dp)
            .background(MaterialTheme.colors.background)
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(56.dp)
                .height(56.dp)
        )
        Text(
            "Short mantras"
        )
    }
}

@Composable
fun ClassesAll() {

}

@Preview()
@Composable
fun HomeScreenPreview() {
    SootheAndroidTheme {
        HomeScreen()
    }
}