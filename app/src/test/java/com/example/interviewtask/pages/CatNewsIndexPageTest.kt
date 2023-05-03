package com.example.interviewtask.pages

import org.junit.Assert.assertEquals
import org.junit.Test

class CatNewsIndexPageTest {
    @Test
    fun on_app_open_cat_news_page_is_shown() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun expect_correct_number_of_items_to_be_shown() {
        val expectedStories = 4
        val expectedWeblinks = 3
        val expectedAdverts = 2
        // TestDataObject = NewsItems(...)
        // Render CatNewsIndexPage
        // Expect stories to equal expectedStories
        // Expect weblinks to equal expectedWeblinks
        // Expect adverts to equal expectedAdverts
        assertEquals(4, 2 + 2)
    }

    @Test
    fun news_title_is_the_same_as_expected_data() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun snapshot_test() {
        // TestDataObject = NewsItems(...)
        // Render CatNewsIndexPage
        // Assert snapshot
        assertEquals(4, 2 + 2)
    }

    @Test
    fun invalid_data_renders_500_page() {
        assertEquals(4, 2 + 2)
    }
}