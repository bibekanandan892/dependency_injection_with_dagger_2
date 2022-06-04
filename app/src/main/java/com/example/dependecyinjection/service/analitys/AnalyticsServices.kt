package com.example.dependecyinjection.service.analitys

interface AnalyticsServices {
    fun eventTrack(eventName: String,eventType: String)
}