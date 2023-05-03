package com.example.interviewtask.pages

import androidx.compose.runtime.Composable
import com.example.interviewtask.components.small.Title


@Composable
fun ErrorPage(status: Int = 500, message: String = "There was an unexpected error") {
    Title("$status - $message")
}
