package com.example.dependecyinjection.component

import com.example.dependecyinjection.module.AnalyticsModule
import com.example.dependecyinjection.service.analitys.AnalyticsServices
import dagger.Component
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    fun getUserRegistrationComponentFactory(): UserRegistrationComponent.Factory
}