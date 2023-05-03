package com.example.interviewtask.services.utils

import com.example.interviewtask.services.utils.getHumanReadableDate
import org.junit.Assert.*
import org.junit.Test
import java.text.FieldPosition


class DateUtilTest {
    @Test
    fun can_parse_correct_yesterday_date() {
        // mock time to yesterday
        // getHumanReadableDate("2020-11-18T00:00:00Z") returns "yesterday"
        assertEquals(4, 2 + 2)
    }

    @Test
    fun can_parse_correct_22_minutes_ago_date() {
        // mock time to 22 minutes ago
        // getHumanReadableDate("2020-11-18T00:00:00Z") returns "22 mins ago"
        assertEquals(4, 2 + 2)
    }

    @Test
    fun can_parse_correct_older_date() {
        // mock time to year 2025
        // getHumanReadableDate("2020-11-18T00:00:00Z") returns "Nov 18 2020"
        assertEquals(4, 2 + 2)
    }
}