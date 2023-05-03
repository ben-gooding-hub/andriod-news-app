package com.example.interviewtask.services.repositories

import android.content.Context
import com.example.interviewtask.services.utils.getJsonDataFromAsset

enum class DatabaseDriver {
    JSON,
    API // Not Implemented
}

val databaseDriver = DatabaseDriver.JSON

abstract class Repository<T>(private val context: Context) {
    abstract val path: String
    abstract fun get(options: List<String>? = emptyList()): T?

    private fun getPath(options: List<String>): String {
        when (databaseDriver) {
            DatabaseDriver.JSON -> return "$path${options.map { option -> "/$option" }.joinToString("")}.json"
            DatabaseDriver.API -> throw NotImplementedError("API Driver not implemented")
        }
    }

    protected fun fetchData(options: List<String>?): String {
        return when (databaseDriver) {
            DatabaseDriver.JSON -> getJsonDataFromAsset(context, getPath(options ?: emptyList()))
            DatabaseDriver.API -> throw NotImplementedError("API Driver not implemented")
        }
    }
}

