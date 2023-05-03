package com.example.interviewtask.services.utils

import android.text.format.DateUtils
import kotlinx.datetime.Instant

val logger = LoggerInstance.logger

fun getHumanReadableDate(date: String) : String {
    try {
        return DateUtils.getRelativeTimeSpanString(Instant.parse(date).toEpochMilliseconds()).toString()
    } catch (e: Exception) {
        // TODO implement logging framework
        logger.log("Failed to parse date: $date")
        return date
    }
}

