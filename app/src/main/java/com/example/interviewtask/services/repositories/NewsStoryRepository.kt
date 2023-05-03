package com.example.interviewtask.services.repositories

import android.content.Context
import com.example.interviewtask.news.NewsStory
import com.example.interviewtask.services.utils.getJsonDataFromAsset
import com.example.interviewtask.services.utils.parseJsonStringToClass
import java.io.FileNotFoundException

class NewsStoryRepository(storyId: String) : Repository<NewsStory> {
    private val storyId = storyId

    private fun getJsonPath(): String {
        return "stories/sample_story_${storyId}.json"
    }

    override fun get(context: Context): NewsStory? {
        try {
            return parseJsonStringToClass(
                getJsonDataFromAsset(context, getJsonPath()),
                NewsStory::class.java
            )
        } catch (e: FileNotFoundException) {
            return null
        }
    }
}
