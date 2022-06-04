package com.example.dependecyinjection.service.analitys

import android.util.Log

class FirebaseMixpanel: AnalyticsServices {
    override fun eventTrack(eventName: String, eventType: String) {
        Log.d(TAG, "eventTrack:::: Firebase ::eventName::$eventName ::::eventType:: $eventType ")
    }
}