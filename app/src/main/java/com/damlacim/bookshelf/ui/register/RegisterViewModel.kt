package com.damlacim.bookshelf.ui.register

import androidx.lifecycle.ViewModel

class RegisterViewModel() : ViewModel() {
    var isPasswordValidate = false

    fun validatePassword(password: String, passwordConfirm: String) {
        isPasswordValidate = if (password.isNotEmpty() || passwordConfirm.isNotEmpty()) {
            password != passwordConfirm
        } else {
            false
        }
    }
}