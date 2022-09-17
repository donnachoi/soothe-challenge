package com.example.sootheandroid.layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sootheandroid.R
import com.example.sootheandroid.navigation.NavRoutes
import com.example.sootheandroid.ui.theme.SootheAndroidTheme

@Composable
fun WelcomeScreen(navigateToLogin: () -> Unit) {
    Surface(color = MaterialTheme.colors.background) {
        WelcomeBgImage()
        WelcomeBody(navigateToLogin)
    }
}

@Composable
fun WelcomeBgImage() {
    val image: Painter = painterResource(id = R.drawable.welcome)
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
fun WelcomeBody(navigateToLogin: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Name()
        ButtonCreate()
        ButtonLogin(navigateToLogin)
    }
}

@Composable
fun Name(
) {
    val image: Painter = painterResource(id = R.drawable.logo)
    Image(
        painter = image,
        contentDescription = "",
        modifier = Modifier
            .padding(30.dp)
    )
}

@Composable
fun ButtonCreate() {
    val buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = MaterialTheme.colors.background,
//        contentColor = MaterialTheme.colors.background,
    )
    Button(
        colors = buttonColors,
        shape = MaterialTheme.shapes.large,
        elevation = null,
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .padding(bottom = 10.dp)
            .height(72.dp),
        onClick = {},
    ) {
        Text("CREATE ACCOUNT")
    }
}

@Composable
fun ButtonLogin(navigateToLogin: () -> Unit) {
    val buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = MaterialTheme.colors.secondary,
        contentColor = MaterialTheme.colors.background,
    )
    Button(
        colors = buttonColors,
        shape = MaterialTheme.shapes.large,
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .padding(bottom = 10.dp)
            .height(72.dp),
        onClick = navigateToLogin,
    ) {
        Text("LOG IN")
    }
}

@Preview(device = "spec:width=411dp,height=891dp")
@Preview(device = "spec:width=673.5dp,height=841dp,dpi=480")
@Preview(device = "spec:width=1280dp,height=800dp,dpi=480")
annotation class RefDevices

/*@RefDevices*/
//@Preview
//@Composable
//fun WelcomeScreenPreview() {
//    val navController = rememberNavController()
//    SootheAndroidTheme() {
//        WelcomeScreen(onNavigateToLogin)
//    }
//}









