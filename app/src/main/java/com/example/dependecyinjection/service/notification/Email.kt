package com.example.dependecyinjection.service.notification

import android.util.Log
import com.example.dependecyinjection.TAG
import com.example.dependecyinjection.annotetion.ActivityScope
import javax.inject.Inject

@ActivityScope
class Email @Inject constructor() : NotificationServices {
    override fun sendNotifications(message: String) {
        Log.d(TAG, "SendEmail: message::: $message")
    }
}