package com.example.interviewtask.services.repositories

import android.content.Context
import com.example.interviewtask.news.NewsStory
import com.example.interviewtask.services.utils.parseJsonStringToClass
import java.io.FileNotFoundException



class NewsStoryRepository(context: Context) : Repository<NewsStory>(context) {
    override val path = "story"

    override fun get(options: List<String>?): NewsStory? {
        if (options == null) throw IllegalArgumentException("Options parameter is required for NewsStoryRepository")
        try {
            return parseJsonStringToClass(
                fetchData(options),
                NewsStory::class.java
            )
        } catch (e: FileNotFoundException) {
            return null
        }
    }
}
