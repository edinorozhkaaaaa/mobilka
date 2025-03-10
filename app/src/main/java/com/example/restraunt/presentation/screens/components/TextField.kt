package com.example.restraunt.presentation.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldEmail(value: String, error: Boolean, onvaluechange: (String) -> Unit) {
    val focusManager = LocalFocusManager.current
    var text by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("email", TextRange(0, 7)))
    }

    OutlinedTextField(
        value = value,
        onValueChange = { onvaluechange(it) },
        textStyle = MaterialTheme.typography.displayMedium,
        isError = !error,
         colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedTextColor = Color.Gray,
            unfocusedBorderColor = Color.Yellow,
            focusedLabelColor = Color.Yellow,
            focusedBorderColor = Color.Yellow,
            containerColor = Color.DarkGray,
            disabledTextColor = Color.White,
        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
       ),
        keyboardActions = KeyboardActions(
            onNext = { focusManager.moveFocus(FocusDirection.Down) }
    ),
        shape = RoundedCornerShape(20.dp),
        label = { Text("email", fontSize = 20.sp, color = Color.Yellow) }, // Текст подсказки внутри поля
        modifier = Modifier
    )

}



@Preview(showBackground = true)
@Composable
fun TextFieldEmailPreview() {
    TextFieldEmail(value = "", error = false, onvaluechange = {})
}