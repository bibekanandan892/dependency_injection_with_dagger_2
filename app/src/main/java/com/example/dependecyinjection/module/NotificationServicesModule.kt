package com.example.dependecyinjection.module


import com.example.dependecyinjection.annotetion.EmailQualifier
import com.example.dependecyinjection.annotetion.MessageQualifier
import com.example.dependecyinjection.service.notification.Email
import com.example.dependecyinjection.service.notification.Message
import com.example.dependecyinjection.service.notification.NotificationServices
import dagger.Module
import dagger.Provides


@Module
class NotificationServicesModule constructor() {

    @Provides
    @MessageQualifier
    fun getMessageServices(retryCount : Int): NotificationServices {
        return Message(retryCount)
    }
    @Provides
    @EmailQualifier
    fun getEmailServices( emailServices: Email): NotificationServices {
        return emailServices
    }

}