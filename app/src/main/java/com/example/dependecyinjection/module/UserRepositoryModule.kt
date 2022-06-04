package com.example.dependecyinjection.module

import com.example.dependecyinjection.FirebaseRepository
import com.example.dependecyinjection.SQLRepository
import com.example.dependecyinjection.UserRepository
import com.example.dependecyinjection.annotetion.ActivityScope
import com.example.dependecyinjection.annotetion.FirebaseServices
import com.example.dependecyinjection.annotetion.SQLServices

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class UserRepositoryModule {

    @Provides
    @SQLServices
    @ActivityScope
    fun getSQLRepository(sqlRepository: SQLRepository): UserRepository{
        return sqlRepository
    }

    @Provides
    @FirebaseServices
    fun getFirebaseRepository():UserRepository{
        return FirebaseRepository()
    }

}