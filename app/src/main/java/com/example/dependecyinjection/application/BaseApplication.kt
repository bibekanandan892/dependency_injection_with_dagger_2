package com.example.dependecyinjection.application

import android.app.Application
import com.example.dependecyinjection.component.AppComponent
import com.example.dependecyinjection.component.DaggerAppComponent


class BaseApplication : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent= DaggerAppComponent.builder().build()
    }
}