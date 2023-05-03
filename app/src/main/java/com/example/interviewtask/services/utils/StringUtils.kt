package com.example.interviewtask.services.utils

fun uppercaseWords(s: String) : String {
    return s
        .split(' ')
        .joinToString(" ") {
            it.replaceFirstChar(Char::uppercaseChar)
        }
}

