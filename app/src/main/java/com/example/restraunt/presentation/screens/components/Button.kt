package com.example.restraunt.presentation.screens.components

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.restraunt.ui.theme.Beige


@Composable
fun ButtonNavigation(label: String, onClick:()-> Unit, ) {
    Button(
        onClick = {
            onClick()
        }, // Устанавливает действие, которое будет выполнено при нажатии на кнопку
        shape = RoundedCornerShape(20.dp), // Устанавливает форму кнопки с закруглёнными углами радиусом
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Black,
            containerColor = Beige
        ), //Настраивает цвета кнопки
        modifier = Modifier
            .height(55.dp)
            .defaultMinSize(minWidth = 150.dp)
            .wrapContentWidth() //Эта цепочка модификаторов изменяет внешний вид и расположение кнопки
    ) {
        //Этот композируемый компонент отображает текст на кнопке
        Text(
            label,
            fontSize = 14.sp,
            color = Color.Black,
            fontWeight = FontWeight.W600,
            fontFamily = FontFamily.SansSerif
        )
    }
}


@Preview(showBackground = true)
@Composable
fun but() {
    ButtonNavigation("вход") { }
}