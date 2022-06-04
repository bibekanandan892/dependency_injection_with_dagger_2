package com.example.dependecyinjection.service.notification

import android.util.Log
import com.example.dependecyinjection.TAG

class Message constructor(private val retryCount: Int): NotificationServices {
    override fun sendNotifications(message: String) {
        Log.d(TAG, "SendMessage: message::: $message ,::::retryCount:::$retryCount")
    }
}