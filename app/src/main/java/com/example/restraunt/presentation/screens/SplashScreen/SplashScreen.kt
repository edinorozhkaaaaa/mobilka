package com.example.restraunt.presentation.screens.SplashScreen

import android.annotation.SuppressLint
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.restraunt.R
import com.example.restraunt.presentation.navigation.NavigationRoutes
import kotlinx.coroutines.delay


@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun SplashScreen(navController: NavHostController) {  // Добавим callback для перехода на следующий экран
    val scale = remember {
        Animatable(0.7f)
    }

    // Анимация и задержка
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(
                durationMillis = 100,
            )
        )

        delay(1500L)
        navController.navigate(NavigationRoutes.MAIN) {
            popUpTo(NavigationRoutes.SPLASH) {
                inclusive = true
            }
        }
    }


    BoxWithConstraints {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black), // Черный фон
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(id = R.drawable.i),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .scale(scale.value)
                        .padding(bottom = 16.dp) // Отступ между лого и полосой загрузки
                )
                // Полоса загрузки
                LinearProgressIndicator(
                    modifier = Modifier
                        .fillMaxWidth(0.8f) // Занимает 80% ширины экрана
                        .height(8.dp),  // Делаем полосу загрузки более заметной
                    color = Color.White,  // Цвет полосы загрузки
                    trackColor = Color.Gray // Цвет фона полосы загрузки
                )
            }
        }
    }
}
