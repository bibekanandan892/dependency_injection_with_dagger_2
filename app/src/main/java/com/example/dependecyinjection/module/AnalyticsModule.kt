package com.example.dependecyinjection.module

import com.example.dependecyinjection.service.analitys.AnalyticsServices
import com.example.dependecyinjection.service.analitys.MixPanel
import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getMixPanel(): AnalyticsServices{
        return MixPanel()
    }
}