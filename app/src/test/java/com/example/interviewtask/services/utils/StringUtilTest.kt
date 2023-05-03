package com.example.interviewtask.services.utils

import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith


class StringUtilTest {
    @Test
    fun sentence_is_returned_uppercase() {
        assertEquals("Hello World", uppercaseWords("hello world"))
    }

    @Test
    fun sentence_is_returned_uppercase_with_double_spaces() {
        assertEquals("Hello  World", uppercaseWords("hello  world"))
    }

    @Test
    fun sentence_is_returned_uppercase_ignores_numbers() {
        assertEquals("1hello World", uppercaseWords("1hello world"))
    }
}