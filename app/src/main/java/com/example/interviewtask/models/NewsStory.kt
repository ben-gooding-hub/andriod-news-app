package com.example.interviewtask.news

import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonTypeName

data class NewsStory(
    val id: String,
    val headline: String,
    val heroImage: HeroImage,
    val creationDate: String,
    val modifiedDate: String,
    val contents: List<NewsContent>,
)

data class HeroImage(
    val imageUrl: String,
    val accessibilityText: String,
)

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
sealed class NewsContent {
    @JsonTypeName("paragraph")
    data class Paragraph(
        val type: String = "paragraph",
        val text: String,
    ) : NewsContent()

    @JsonTypeName("image")
    data class Image(
        val type: String = "image",
        val url: String,
        val accessibilityText: String,
    ) : NewsContent()
}



