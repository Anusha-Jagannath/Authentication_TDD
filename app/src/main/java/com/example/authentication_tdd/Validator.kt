package com.example.authentication_tdd

import java.util.regex.Pattern

class Validator {

    fun isValidEmail(email: String?): Boolean {
        if (email.isNullOrBlank()) return false
        if (!email.contains("@")) return false
        val pattern = Pattern.compile("[\\w|\\d.]+@[\\w]+.[\\w]{2,}")
        return pattern.matcher(email).matches()
    }

    fun isValidName(name: String?): Boolean {
        if (name.isNullOrBlank()) return false
        val pattern =
            Pattern.compile("^[A-Za-z]{1}(?:[a-z]{2,})? (?:[a-zA-Z]{1,})?\\s?[a-zA-Z]{1,}\$")
        return pattern.matcher(name).matches()
    }

    fun isValidPassword(password: String?): Boolean {
        if (password.isNullOrBlank()) return false
        val pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#\$%^&]).{8,}")
        return pattern.matcher(password).matches()
    }
}