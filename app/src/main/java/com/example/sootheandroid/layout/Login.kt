package com.example.sootheandroid.layout

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sootheandroid.R
import com.example.sootheandroid.navigation.NavRoutes
import com.example.sootheandroid.ui.theme.SootheAndroidTheme

@Composable
fun LoginScreen(navController: NavController) {
    Surface(color = MaterialTheme.colors.background) {
        LoginBgImage()
        LoginBody()
        Button(onClick = {navController.navigate(NavRoutes.Welcome.route)}) {
            Text("Go to Welcome")
        }
    }
}

@Composable
fun LoginBgImage() {
    val image: Painter = painterResource(id = R.drawable.login)
    Image(
        painter = image,
        contentDescription = "",
        contentScale = ContentScale.FillBounds,
        alpha = 0.75f,
        modifier = Modifier
            .fillMaxSize(1f)
            .zIndex(-2f)
    )
}

@Composable
fun LoginBody() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            "Log in",
            style = MaterialTheme.typography.h1,
            modifier = Modifier
                .padding(12.dp)
        )
        TextFieldEmail()
        TextFieldPassword()
//        ButtonLogin()
        Text("Don???t have an account? Sign up")
    }
}

@Composable
fun TextFieldEmail(
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
fun TextFieldPassword(
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
            Text(text = "Password")
        },
    )
}

@Preview(device = "spec:width=411dp,height=891dp")
@Preview(
    device = "spec:width=411dp,height=891dp",
    uiMode = UI_MODE_NIGHT_YES
)
@Preview(device = "spec:width=1280dp,height=800dp,dpi=480")
@Composable
fun LoginPreview() {
    val navController = rememberNavController()
    SootheAndroidTheme {
        LoginScreen(navController)
    }
}