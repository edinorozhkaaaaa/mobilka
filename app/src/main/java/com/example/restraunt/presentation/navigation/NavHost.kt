package com.example.restraunt.presentation.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.restraunt.presentation.screens.SignInSreen.SingInScreen
import com.example.restraunt.presentation.screens.SplashScreen.SplashScreen


@Composable
fun NavHost() {
    val navController = rememberNavController()
    Surface(color = MaterialTheme.colorScheme.background) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            NavHost(navController = navController, startDestination = NavigationRoutes.SPLASH) {
                composable(NavigationRoutes.SPLASH)
                {
                    SplashScreen(navController)
                }
                composable(NavigationRoutes.SIGNIN)
                {
                    SingInScreen((navController))
                }
                composable(NavigationRoutes.SIGNUP) {

                }



            }
        }
    }
}