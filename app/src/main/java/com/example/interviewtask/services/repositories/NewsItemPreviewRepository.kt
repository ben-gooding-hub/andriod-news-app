package com.example.interviewtask.services.repositories

import android.content.Context
import com.example.interviewtask.news.NewsItemPreview
import com.example.interviewtask.services.utils.parseJsonStringToClass
import java.io.FileNotFoundException

data class NewsResponse(
    val title: String,
    val data: List<NewsItemPreview>
)

class NewsItemPreviewRepository(context: Context) : Repository<NewsResponse>(context) {
    override val path = "news-list"

    override fun get(options: List<String>?): NewsResponse? {
        try {
            return parseJsonStringToClass(
                fetchData(options),
                NewsResponse::class.java
            )
        } catch (e: FileNotFoundException) {
            return null
        }
    }
}

