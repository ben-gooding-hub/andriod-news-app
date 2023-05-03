package com.example.interviewtask.components.news

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interviewtask.components.small.DateText
import com.example.interviewtask.components.small.Link
import com.example.interviewtask.components.small.Subtitle
import com.example.interviewtask.news.Links
import com.example.interviewtask.news.NewsItemPreview
import com.example.interviewtask.news.TeaserImage
import com.example.interviewtask.news.Url

@Composable
fun NewsWeblink(weblink: NewsItemPreview.NewsWeblink) {
    Column(
        modifier = Modifier
            .padding(horizontal = 3.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Subtitle(
                weblink.headline,
            )
            DateText(
                rawDate = weblink.creationDate,
                modifier = Modifier
                    .align(Alignment.TopEnd),
            )
        }
        Link(
            text = weblink.weblinkUrl,
            url = weblink.weblinkUrl
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWeblink() {
    NewsWeblink(NewsItemPreview.NewsWeblink(
        id = "f",
        type = "weblink",
        headline = "Weblink headline",
        creationDate = "creationDate",
        modifiedDate = "creationDate",
        teaserImage = TeaserImage(
            links = Links(
                url = Url(
                    href = "",
                    templated = false,
                    type = ""
                )
            ),
            accessibilityText = ""
        ),
        weblinkUrl = "some URL",
    ))
}