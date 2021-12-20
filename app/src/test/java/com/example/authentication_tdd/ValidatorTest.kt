package com.example.authentication_tdd

import org.junit.Assert
import org.junit.Test

class ValidatorTest {

    @Test
    fun givenNull_WhenValidateEmail_ThenReturnsFalse() {
        val validator = Validator()
        val isEmailValid = validator.isValidEmail(null)
        Assert.assertFalse(isEmailValid)
    }

    @Test
    fun givenEmptyString_WhenValidateEmail_ThenReturnsFalse() {
        val validator = Validator()
        val isEmailValid = validator.isValidEmail("")
        Assert.assertFalse(isEmailValid)
        Assert.assertFalse(validator.isValidEmail(" "))
        Assert.assertFalse(validator.isValidEmail("\n"))
        Assert.assertFalse(validator.isValidEmail("\r\n"))
    }

    @Test
    fun givenInvalidEmail_WhenValidateEmail_ThenReturnsFalse() {
        val validator = Validator()
        val isEmailValid = validator.isValidEmail("anushajs")
        Assert.assertFalse(isEmailValid)
    }

    @Test
    fun givenAtAtTheEndOfEmail_WhenValidateEmail_ThenReturnsFalse() {
        val validator = Validator()
        val isEmailValid = validator.isValidEmail("smitajain@")
        Assert.assertFalse(isEmailValid)
    }

    @Test
    fun givenValidEmailWithoutDigit_WhenValidateEmail_ThenReturnsTrue() {
        val validator = Validator()
        val isEmailValid = validator.isValidEmail("smitajain@gmail.com")
        Assert.assertTrue(isEmailValid)

    }

    @Test
    fun givenValidEmailWithDigit_WhenValidateEmail_ThenReturnsTrue() {
        val validator = Validator()
        val isEmailValid = validator.isValidEmail("smita345@gmail.com")
        Assert.assertTrue(isEmailValid)

    }

    @Test
    fun givenValidEmail_WhenValidateEmail_ThenReturnsTrue() {
        val validator = Validator()
        val isEmailValid = validator.isValidEmail("smita345@gmail.co")
        Assert.assertTrue(isEmailValid)

    }

    @Test
    fun givenValidEmailWithDot_WhenValidateEmail_ThenReturnsTrue() {
        val validator = Validator()
        val isEmailValid = validator.isValidEmail("smita.s@gmail.com")
        Assert.assertTrue(isEmailValid)

    }

    @Test
    fun givenNull_WhenValidateName_ThenReturnsFalse() {
        val validator = Validator()
        val isNameValid = validator.isValidName(null)
        Assert.assertFalse(isNameValid)
    }

    @Test
    fun givenEmpty_WhenValidateName_ThenReturnsFalse() {
        val validator = Validator()
        val isNameValid = validator.isValidName("")
        Assert.assertFalse(isNameValid)
        Assert.assertFalse(validator.isValidName(" "))
        Assert.assertFalse(validator.isValidName("\n"))
        Assert.assertFalse(validator.isValidName("\r\n"))
    }

    @Test
    fun givenInvalidNameWithTwoCharacter_WhenValidateName_ThenReturnsFalse() {
        val validator = Validator()
        Assert.assertFalse(validator.isValidName("Sm"))
    }

    @Test
    fun givenInvalidNameWithDigits_WhenValidateName_ThenReturnsFalse() {
        val validator = Validator()
        Assert.assertFalse(validator.isValidName("Smita123"))
    }

    @Test
    fun givenInvalidNameWithSpecialCharacter_WhenValidateName_ThenReturnsFalse() {
        val validator = Validator()
        Assert.assertFalse(validator.isValidName("Smita@#"))
    }

    @Test
    fun givenNameWithSurname_WhenValidateName_ThenReturnsTrue() {
        val validator = Validator()
        Assert.assertTrue(validator.isValidName("Anusha J"))
    }

    @Test
    fun givenNameWithMiddleNameAndSurname_WhenValidateName_ThenReturnsTrue() {
        val validator = Validator()
        Assert.assertTrue(validator.isValidName("Purushotam Narayan Verma"))
    }

    @Test
    fun givenNameWithSingleLetterMiddleNameAndSurname_WhenValidateName_ThenReturnsTrue() {
        val validator = Validator()
        Assert.assertTrue(validator.isValidName("Purushotam N Verma"))
    }


    @Test
    fun givenSingleLetterFirstNameWithSingleLetterMiddleNameAndSurname_WhenValidateName_ThenReturnsTrue() {
        val validator = Validator()
        Assert.assertTrue(validator.isValidName("P N Verma"))
    }

    @Test
    fun givenNull_WhenValidatePassword_ThenReturnsFalse() {
        val validator = Validator()
        val isPasswordValid = validator.isValidPassword(null)
        Assert.assertFalse(isPasswordValid)
    }

    @Test
    fun givenEmptyPassword_WhenValidatePassword_ThenReturnsFalse() {
        val validator = Validator()
        val isPasswordValid = validator.isValidPassword("")
        Assert.assertFalse(isPasswordValid)
        Assert.assertFalse(validator.isValidPassword(" "))
        Assert.assertFalse(validator.isValidPassword("\n"))
        Assert.assertFalse(validator.isValidPassword("\r\n"))
    }

    @Test
    fun givenValidPassword_WhenValidatePassword_ThenReturnsTrue() {
        val validator = Validator()
        Assert.assertTrue(validator.isValidPassword("Smitakar@123"))
    }

    @Test
    fun givenInvalidPasswordWithLessCharacter_WhenValidatePassword_ThenReturnsFalse() {
        val validator = Validator()
        Assert.assertFalse(validator.isValidPassword("dfg"))
    }

    @Test
    fun givenInvalidPasswordWithNoSpecialCharacter_WhenValidatePassword_ThenReturnsFalse() {
        val validator = Validator()
        Assert.assertFalse(validator.isValidPassword("dfg56790"))
    }

    @Test
    fun givenInvalidPasswordWithNoDigit_WhenValidatePassword_ThenreturnsFalse() {
        val validator = Validator()
        Assert.assertFalse(validator.isValidPassword("dfghjkio@"))
    }
}