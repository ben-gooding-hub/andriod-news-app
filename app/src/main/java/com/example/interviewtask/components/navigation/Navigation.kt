package com.example.interviewtask.components.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.interviewtask.pages.CatNewsIndexPage
import com.example.interviewtask.pages.CatNewsStoryPage
import com.example.interviewtask.pages.ErrorPage

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.NewsIndexScreen.route) {
        composable(Screen.NewsIndexScreen.route) {
            CatNewsIndexPage(navController)
        }
        composable(
            Screen.NewsStoryScreen.route + "/{storyId}",
            arguments = listOf(
                navArgument("storyId") {
                    type = NavType.StringType
                }
            )
        ) { entry ->
            val storyId = entry.arguments?.getString("storyId")
             if (storyId == null)
                 ErrorPage() else
                 CatNewsStoryPage(navController, storyId)
        }
    }
}