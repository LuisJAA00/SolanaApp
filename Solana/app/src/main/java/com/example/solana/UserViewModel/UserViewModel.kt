package com.example.solana.UserViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class UserViewModel: ViewModel() {

    private var Username: String by mutableStateOf("not jijija")

    val userName: String
        get() = Username

    fun setName(name2Assign: String) {
        Username = name2Assign
    }

    private var useremail: String by mutableStateOf("")

    val _userEmail: String
        get() = useremail

    fun setEmail(newEmail: String)
    {
        useremail = newEmail
    }

    private var userPassword: String by mutableStateOf("")

    val _userPassword: String
        get() = userPassword

    fun setPass(paswword: String)
    {
        userPassword = paswword
    }

    private var userFolio: String by mutableStateOf("")

    val _userFolio: String
        get() = userFolio

    fun setFolio(newFolio: String)
    {
        userFolio = newFolio
    }

    private var userCancerType: String by mutableStateOf("")

    val _userCancerTyper: String
        get() = userCancerType

    fun setCancerType(type: String)
    {
        userCancerType = type
    }






}