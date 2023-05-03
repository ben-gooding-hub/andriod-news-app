package com.example.interviewtask.pages

import androidx.compose.runtime.Composable
import com.example.interviewtask.components.small.Title

@Composable
fun MissingPage(status: Int = 404) {
    Title(title = "$status - Page not found")
}
