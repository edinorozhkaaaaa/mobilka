package com.example.restraunt.presentation.screens.SignInSreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.restraunt.presentation.screens.components.TextFieldEmail
import com.example.restraunt.presentation.screens.components.TextFieldPassword
import io.ktor.websocket.Frame

@Composable
fun SingInScreen(navController: NavHostController)
{
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

    }

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().background(Color.Black)
    )
    {
        Text(text="Welcome!", fontSize = 40.sp, fontFamily = FontFamily.Cursive, color = Color.LightGray,
        modifier = Modifier.align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.height(100.dp))

        TextFieldEmail("", false )
        {

        }
        Spacer(modifier = Modifier.height(20.dp))

        TextFieldPassword("", false )
        {

        }
    }
}

@Preview()
@Composable
fun signPreview() {
    SingInScreen(rememberNavController() )
}
