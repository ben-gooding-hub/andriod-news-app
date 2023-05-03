package com.example.interviewtask.components.news

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.interviewtask.R
import com.example.interviewtask.components.navigation.Screen
import com.example.interviewtask.components.small.DateText
import com.example.interviewtask.components.small.Subtitle
import com.example.interviewtask.news.Links
import com.example.interviewtask.news.NewsItemPreview
import com.example.interviewtask.news.TeaserImage
import com.example.interviewtask.news.Url


@Composable
fun NewsStory(story: NewsItemPreview.NewsStory, navController: NavController) {
    fun onClickNewsStory(story: NewsItemPreview.NewsStory) {
        navController.navigate(Screen.NewsStoryScreen.route + "/${story.id}")
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 3.dp)
            .clickable {
                onClickNewsStory(story)
            },
    ) {
        Image(
            painter = painterResource(R.drawable.cat_news_index),
            contentDescription = story.teaserImage.accessibilityText,
            modifier = Modifier
                .size(40.dp)
                .padding(3.dp)
        )
        Column {
            Box(modifier = Modifier.fillMaxWidth()) {
                Subtitle(
                    subtitle = story.headline,
                    modifier = Modifier.padding(horizontal = 3.dp)
                )
                DateText(
                    rawDate = story.creationDate,
                    modifier = Modifier
                        .align(Alignment.TopEnd),
                )
            }
            Text(
                text = story.teaserText,
                modifier = Modifier.padding(horizontal = 3.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewStory() {
    NewsStory(story = NewsItemPreview.NewsStory(
        id = "1",
        headline = "headline",
        creationDate = "2022",
        modifiedDate = "modifiedDate",
        teaserImage = TeaserImage(
            links = Links(
                url = Url(
                    href = "href",
                    templated = false,
                    type = "type"
                )
            ),
            accessibilityText = "accessibilityText"
        ),
        teaserText = "teaserText"
    ), NavController(LocalContext.current)
    )
}