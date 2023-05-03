package com.example.interviewtask.components.news

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.interviewtask.components.small.Subtitle
import com.example.interviewtask.news.NewsItemPreview

@Composable
fun NewsAdvert(advert: NewsItemPreview.NewsAdvert) {
    Column(
        modifier = Modifier
            .padding(horizontal = 3.dp)
    ) {
        Subtitle(advert.type)
        Image(
            painter = rememberAsyncImagePainter(advert.url),
            contentDescription = null,
            modifier = Modifier.size(128.dp)
        )
    }
}