package com.saugatligal.mobileappchallenge.shared

sealed class Result<out T> {
    data class Error(val errorMessage: String) : Result<Nothing>()
    data class Success<T>(val data: T) : Result<T>()
}