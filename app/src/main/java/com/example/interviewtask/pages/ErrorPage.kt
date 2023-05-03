package com.example.interviewtask.pages

import androidx.compose.runtime.Composable
import com.example.interviewtask.components.small.Title
import com.example.interviewtask.services.utils.LoggerInstance
import java.util.logging.Level

val logger = LoggerInstance.logger

@Composable
fun ErrorPage(status: Int = 500, message: String = "There was an unexpected error") {
    logger.log("ErrorPage: $status - $message", Level.SEVERE)
    Title("$status - $message")
}
