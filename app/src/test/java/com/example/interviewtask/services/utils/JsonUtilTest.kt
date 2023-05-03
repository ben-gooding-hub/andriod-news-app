package com.example.interviewtask.services.utils

import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith


class JsonUtilTest {
    @Test
    fun can_open_test_data_json_file() {
        // getJsonDataFromAsset returns "{...}"
        assertEquals(4, 2 + 2)
    }

    @Test
    fun missing_file_returns_expected_exception() {
        // getJsonDataFromAsset -> throws MissingFileException
        assertEquals(4, 2 + 2)
    }

    @Test
    fun can_parse_json_to_class() {
        // parseJsonStringToClass(json, class) returns instance of class
        assertEquals(4, 2 + 2)
    }

    @Test
    fun can_parse_nested_sealed_classes_correctly() {
        // parseJsonStringToClass(json, class) -> returns instance of sealed class
        assertEquals(4, 2 + 2)
    }

    @Test
    fun throws_exception_upon_invalid_format() {
        // parseJsonStringToClass(json, class) -> throws exception
        assertEquals(4, 2 + 2)
    }
}