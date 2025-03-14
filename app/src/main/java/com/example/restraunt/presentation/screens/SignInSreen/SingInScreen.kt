package com.example.restraunt.presentation.screens.SignInSreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.restraunt.R
import com.example.restraunt.domain.state.ResultState
import com.example.restraunt.presentation.navigation.NavigationRoutes
import com.example.restraunt.presentation.screens.components.ButtonNavigation
import com.example.restraunt.presentation.screens.components.TextFieldEmail
import com.example.restraunt.presentation.screens.components.TextFieldPassword
import com.example.restraunt.ui.theme.Beige
import io.ktor.websocket.Frame

@Composable
fun SingInScreen(navController: NavHostController, signInViewModel: SignInViewModel = viewModel())
{
    val resultState by signInViewModel.resultState.collectAsState() // использует collectAsState() для преобразования потока состояний (Flow<ResultState>) из ViewModel в состояние
    val uiState = signInViewModel.uiState //получает текущее состояние UI из ViewModel

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().background(Color.Black)
    )
    {
        Text(text="Welcome!", fontSize = 40.sp, fontFamily = FontFamily.Cursive, color = Beige,
        modifier = Modifier.align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.height(100.dp))

        TextFieldEmail(value = uiState.email, error = uiState.errorEmail,
            onvaluechange = { it -> signInViewModel.updateState(uiState.copy(email = it)) })

        Spacer(modifier = Modifier.height(20.dp))

//        TextFieldPassword(uiState.password)
//
//        Spacer(modifier = Modifier.height(20.dp))
//        when (resultState) {
//            is ResultState.Error -> {
//                ButtonNavigation("вход")) {
//                    signInViewModel.signIn().toString()
//
//                }
//                Text((resultState as ResultState.Error).message)
//            }
//
//            is ResultState.Initialized -> {
//                ButtonNavigation("вход")) {
//                    signInViewModel.signIn().toString()
//                }
//            }
//
//            ResultState.Loading -> {
//                CircularProgressIndicator()
//            }
//
//            is ResultState.Success -> {
//                navController.navigate(NavigationRoutes.MAIN)
//                {
//                    popUpTo(NavigationRoutes.SIGNIN) {
//                        inclusive = true
//                    }
//                }
//            }
//        }
//    }



    }
}


//@Preview()
//@Composable
//fun signPreview() {
//    SingInScreen(rememberNavController() )
//}
