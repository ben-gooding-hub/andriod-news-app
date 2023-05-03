package com.example.interviewtask.components.navigation

sealed class Screen(val route: String) {
    object NewsIndexScreen : Screen("news_index")
    object NewsStoryScreen : Screen("news_story")
}