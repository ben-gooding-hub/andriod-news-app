package com.example.interviewtask.services.utils

import java.util.logging.Level

interface Logger {
    fun log(message: String, level: Level? = Level.INFO)
}

private class ConsoleLogger : Logger {
    override fun log(message: String, level: Level?) {
        println(message)
    }
}

object LoggerInstance {
    var logger: Logger = ConsoleLogger()
}



