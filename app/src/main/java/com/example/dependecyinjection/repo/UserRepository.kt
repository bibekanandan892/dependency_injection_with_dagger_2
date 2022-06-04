package com.example.dependecyinjection

import android.util.Log
import com.example.dependecyinjection.annotetion.ActivityScope
import com.example.dependecyinjection.service.analitys.AnalyticsServices
import javax.inject.Inject

const val TAG= "Your Message"

interface UserRepository{
    fun saveUser(email: String, password: String)
}
@ActivityScope
class SQLRepository @Inject constructor(private val analyticsServices: AnalyticsServices) : UserRepository  {
    override fun saveUser(email: String, password: String){
        Log.d(TAG, "saveUser in DB::::  Email:$email  :: Password:$password ")
        analyticsServices.eventTrack("$email is registered in Analytics","User registration")

    }
}
class FirebaseRepository constructor(): UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser in Firebase::::  Email:$email  :: Password:$password ")
    }

}