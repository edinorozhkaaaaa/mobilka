package com.example.restraunt.presentation.screens.SignInSreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.restraunt.presentation.screens.components.TextFieldEmail
import io.ktor.websocket.Frame

@Composable
fun SingInScreen(navController: NavHostController)
{
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().background(Color.Red)
    )
    {
        Text(text="dfgdfg")
        TextFieldEmail("", false )
        {

        }
    }
}

@Preview()
@Composable
fun signPreview() {
    SingInScreen(rememberNavController() )
}
