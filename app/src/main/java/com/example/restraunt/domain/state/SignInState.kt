package com.example.restraunt.domain.state

data class SignInState (
    val email: String = "",
    val password: String = "",
    var errorEmail:Boolean = false,
    val errorPassword:Boolean = false
)