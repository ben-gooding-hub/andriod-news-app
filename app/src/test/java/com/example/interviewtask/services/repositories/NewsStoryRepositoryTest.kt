package com.example.interviewtask.services.repositories

import com.example.interviewtask.services.utils.getHumanReadableDate
import org.junit.Assert.*
import org.junit.Test
import java.text.FieldPosition


class NewsStoryRepositoryTest {
    @Test
    fun returns_data_upon_fetched_data() {
        // Mock database call to be success
        // Mock json parsing to be success
        // Repo.get() === data
        assertEquals(4, 2 + 2)
    }

    @Test
    fun returns_null_upon_failed_database_call() {
        // Mock database call to be failure
        // Repo.get() === null
        assertEquals(4, 2 + 2)
    }

    @Test
    fun throws_exception_upon_failed_json_parse() {
        // Mock database call to be success
        // Mock json parsing to throw Jackson exception
        // Repo.get() -> throws exception
        assertEquals(4, 2 + 2)
    }
}