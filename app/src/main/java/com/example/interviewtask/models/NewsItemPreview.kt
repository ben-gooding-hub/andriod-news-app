package com.example.interviewtask.news

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonTypeName

data class Url(
    val href: String,
    val templated: Boolean,
    val type: String
)

data class Links(
    val url: Url,
)

data class TeaserImage(
    @JsonProperty("_links")
    val links: Links,
    val accessibilityText: String
)

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
sealed class NewsItemPreview{
    @JsonTypeName("story")
    data class NewsStory(
        val id: String,
        val type: String = "story",
        val headline: String,
        val creationDate: String,
        val modifiedDate: String,
        val teaserImage: TeaserImage,

        val teaserText: String
    ) : NewsItemPreview()

    @JsonTypeName("weblink")
    data class NewsWeblink(
        val id: String,
        val type: String = "weblink",
        val headline: String,
        val creationDate: String,
        val modifiedDate: String,
        val teaserImage: TeaserImage,

        val weblinkUrl: String
    ) : NewsItemPreview()

    @JsonTypeName("advert")
    data class NewsAdvert(
        val type: String = "advert",
        val url: String,
    ) : NewsItemPreview()
}



