package com.example.restraunt.presentation.screens.SplashScreen

import android.annotation.SuppressLint
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateValue
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.restraunt.R
import com.example.restraunt.presentation.navigation.NavigationRoutes
import kotlinx.coroutines.delay
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.restraunt.ui.theme.Beige


@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun SplashScreen(navController: NavHostController) {
    val scale = remember { Animatable(0.5f) }
    var dotCount by remember { mutableStateOf(0) } // Счетчик точек
    val infiniteTransition = rememberInfiniteTransition()


    // Анимация изменения количества точек
    val animatedDotCount by infiniteTransition.animateValue(
        initialValue = 0,
        targetValue = 4,
        typeConverter = Int.VectorConverter,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1500, easing = LinearEasing), // 1500 миллисекунд на точку
            repeatMode = RepeatMode.Restart
        )
    )

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.7f
        )

        delay(3000L)
        navController.navigate(NavigationRoutes.SIGNIN) {
            popUpTo(NavigationRoutes.SPLASH) {
                inclusive = true
            }
        }
    }

    dotCount = animatedDotCount

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        )
        {
            Image(
                painter = painterResource(id = R.drawable.i),
                contentDescription = "Splash Image",
                modifier = Modifier.size(200.dp)
            )

                //расстояние между картинкой и текстом
            Spacer(modifier = Modifier.height(16.dp))


            Text("Loading" + ".".repeat(dotCount),
                fontSize = 50.sp,
                color = Beige ,
                fontFamily = FontFamily.Cursive
            )
            }



        }
    }


