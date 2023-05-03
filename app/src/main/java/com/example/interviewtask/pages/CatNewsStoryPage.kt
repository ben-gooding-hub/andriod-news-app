package com.example.interviewtask.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.interviewtask.R
import com.example.interviewtask.components.small.DateText
import com.example.interviewtask.components.small.Title
import com.example.interviewtask.news.HeroImage
import com.example.interviewtask.news.NewsContent
import com.example.interviewtask.news.NewsStory
import com.example.interviewtask.services.repositories.NewsStoryRepository


@Composable
fun CatNewsStoryPage(navController: NavController, storyId: String) {
    val article = NewsStoryRepository(storyId).get(LocalContext.current)
    if (article == null) {
        MissingPage()
        return
    }
    Story(article)
}

@Composable
fun Story(article: NewsStory) {
    val scrollState = rememberScrollState()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .verticalScroll(scrollState)
            .padding(horizontal = 3.dp)
    ) {
        Title(article.headline)
        Image(
            painter = painterResource(R.drawable.cat_news_index),
            contentDescription = article.heroImage.accessibilityText,
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .height(250.dp)
        )
        DateText(
            rawDate = article.creationDate,
            modifier = Modifier
                .align(Alignment.End),
        )
        Divider(color = Color.LightGray, thickness = 1.dp)
        article.contents.forEach { content ->
            when (content) {
                is NewsContent.Paragraph -> Text(content.text)
                is NewsContent.Image -> Text(content.accessibilityText)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewStory() {
    Story(article = NewsStory(
        id = "1",
        headline = "Headline",

        heroImage = HeroImage(
            imageUrl = "",
            accessibilityText = "Accessibility text"
        ),
        creationDate = "2021-01-01T00:00:00.000Z",
        modifiedDate = "2021-01-01T00:00:00.000Z",
        contents = listOf(
            NewsContent.Paragraph("Paragraph 1", "Paragraph 1"),
        ),
    ))
}
