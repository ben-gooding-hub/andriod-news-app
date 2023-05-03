package com.example.interviewtask.services.repositories

import android.content.Context

interface Repository<T> {
    fun get(context: Context): T?
}

