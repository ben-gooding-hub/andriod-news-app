package com.example.interviewtask.services.repositories

import android.content.Context
import com.example.interviewtask.news.NewsItemPreview
import com.example.interviewtask.services.utils.getJsonDataFromAsset
import com.example.interviewtask.services.utils.parseJsonStringToClass
import java.io.FileNotFoundException

data class NewsResponse(
    val title: String,
    val data: List<NewsItemPreview>
)

class NewsItemPreviewRepository : Repository<NewsResponse> {
    private val jsonPath = "sample_list.json"

    override fun get(context: Context): NewsResponse? {
        try {
            return parseJsonStringToClass(
                getJsonDataFromAsset(context, jsonPath),
                NewsResponse::class.java
            )
        } catch (e: FileNotFoundException) {
            return null
        }
    }
}

