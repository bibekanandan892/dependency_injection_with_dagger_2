package com.example.dependecyinjection.component

import com.example.dependecyinjection.MainActivity
import com.example.dependecyinjection.annotetion.ActivityScope
import com.example.dependecyinjection.module.AnalyticsModule
import com.example.dependecyinjection.module.NotificationServicesModule
import com.example.dependecyinjection.module.UserRepositoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent( modules = [UserRepositoryModule::class, NotificationServicesModule::class])
interface UserRegistrationComponent {


    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(@BindsInstance retryCount : Int):UserRegistrationComponent
    }


}