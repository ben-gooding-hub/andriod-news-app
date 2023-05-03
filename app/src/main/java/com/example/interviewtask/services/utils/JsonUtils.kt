package com.example.interviewtask.services.utils

import android.content.Context
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

fun getJsonDataFromAsset(context: Context, fileName: String): String {
    return context.assets.open(fileName).bufferedReader().use { it.readText() }
}

private val mapper = jacksonObjectMapper()

fun <T> parseJsonStringToClass(json: String, classType: Class<T>): T {
    return mapper.readValue(json, classType)
}