package com.example.interviewtask.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.interviewtask.R
import com.example.interviewtask.components.news.NewsAdvert
import com.example.interviewtask.components.news.NewsStory
import com.example.interviewtask.components.news.NewsWeblink
import com.example.interviewtask.components.small.Title
import com.example.interviewtask.news.NewsItemPreview
import com.example.interviewtask.services.repositories.NewsItemPreviewRepository


@Composable
fun CatNewsIndexPage(navController: NavController) {
    val response = NewsItemPreviewRepository().get(LocalContext.current)
    if(response == null) {
        ErrorPage()
        return
    }
    val scrollState = rememberScrollState()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .verticalScroll(scrollState)
    ) {
        Title(response.title)
        Image(
            painter = painterResource(R.drawable.cat_news_index),
            contentDescription = "Cat News Image",
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .height(250.dp)
        )
        NewsItems(response.data, navController)
    }
}

@Composable
fun NewsItems(NewItems: List<NewsItemPreview>, navController: NavController) {
    Column(
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        NewItems.forEach { newsData ->
            Divider(color = Color.Black, thickness = 1.dp)
            when (newsData) {
                is NewsItemPreview.NewsStory -> NewsStory(newsData, navController)
                is NewsItemPreview.NewsAdvert -> NewsAdvert(newsData)
                is NewsItemPreview.NewsWeblink -> NewsWeblink(newsData)
            }
        }
    }
}


