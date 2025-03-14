package com.example.restraunt.domain.Utils

import android.text.TextUtils

fun String.isEmailValid () : Boolean {
    return !TextUtils.isEmpty(this) && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
}