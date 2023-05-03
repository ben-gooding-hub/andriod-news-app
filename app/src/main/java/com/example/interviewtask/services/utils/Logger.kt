package com.example.interviewtask.services.utils

import java.util.logging.Level

enum class LogDriver {
    CONSOLE
}

val logDriver = LogDriver.CONSOLE

fun log(message: String, level: Level? = Level.INFO) {
    when(logDriver) {
        LogDriver.CONSOLE -> println(message)
    }
}





