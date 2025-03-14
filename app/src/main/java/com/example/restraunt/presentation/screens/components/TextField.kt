package com.example.restraunt.presentation.screens.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.restraunt.ui.theme.Beige


@Composable
fun TextFieldEmail(value: String, error: Boolean, onvaluechange: (String) -> Unit) {
    OutlinedTextField(
        value = value,
        onValueChange = { onvaluechange(it) },
        textStyle = MaterialTheme.typography.displayMedium,
        isError = error,
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Beige,
            unfocusedBorderColor = Beige,
            focusedLabelColor = Beige,
            unfocusedLabelColor = Beige,
            
        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
       ),
        shape = RoundedCornerShape(14.dp),
        label = { Text("email", fontSize = 20.sp, color = Beige) }, // Текст подсказки внутри поля
        modifier = Modifier
    )
}

@Composable
fun TextFieldPassword(value: String, onvaluechange: (String) -> Unit) {
    OutlinedTextField(
        value = value,
        onValueChange = { onvaluechange(it) },
        textStyle = MaterialTheme.typography.displayMedium,
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Beige,
            unfocusedBorderColor = Beige,
            focusedLabelColor = Beige,
            unfocusedLabelColor = Beige,
        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        ),
        shape = RoundedCornerShape(14.dp),
        label = { Text("пароль", fontSize = 20.sp, color = Beige) },
        modifier = Modifier
    )
}



//@Preview(showBackground = true)
//@Composable
//fun TextFieldEmailPreview() {
//    TextFieldEmail(value = "", error = false, onvaluechange = {})
//}