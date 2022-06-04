package com.example.dependecyinjection.service.userRegistration

import com.example.dependecyinjection.UserRepository
import com.example.dependecyinjection.annotetion.ActivityScope
import com.example.dependecyinjection.annotetion.MessageQualifier
import com.example.dependecyinjection.annotetion.SQLServices
import com.example.dependecyinjection.service.notification.NotificationServices
import javax.inject.Inject

@ActivityScope
class UserRegistrationServices @Inject constructor(
    @SQLServices private val userRepository: UserRepository,
    @MessageQualifier private val notification: NotificationServices,

) {
    fun saveUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notification.sendNotifications("$email is registered")
    }

}