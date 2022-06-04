package com.example.dependecyinjection.service.analitys

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

const val TAG="Your Message"
@Singleton
class MixPanel @Inject constructor() : AnalyticsServices {
    override fun eventTrack(eventName: String, eventType: String) {
        Log.d(TAG, "eventTrack:::: mixPanel ::eventName::$eventName ::::eventType:: $eventType ")
    }
}