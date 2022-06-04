package com.example.dependecyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependecyinjection.application.BaseApplication
import com.example.dependecyinjection.component.UserRegistrationComponent
import com.example.dependecyinjection.service.notification.Email
import com.example.dependecyinjection.service.userRegistration.UserRegistrationServices
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationServices : UserRegistrationServices
    @Inject
    lateinit var userRegistrationComponent: UserRegistrationComponent

    @Inject
    lateinit var email: Email

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  appComponent=(application as BaseApplication).appComponent
        userRegistrationComponent=appComponent.getUserRegistrationComponentFactory().create(2345)

        userRegistrationComponent.inject(this)
        email.sendNotifications("67890")
        userRegistrationServices.saveUser("Bibekanandan892@gmail.com","11111111")

    }
}