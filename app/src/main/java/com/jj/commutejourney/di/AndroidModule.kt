package com.jj.commutejourney.di

import android.content.Context
import android.content.Context.LOCATION_SERVICE
import android.location.LocationManager
import com.jj.commutejourney.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AndroidModule(private val application: App) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return application
    }

    @Provides @Singleton
    fun provideLocationManager(): LocationManager {
        return application.getSystemService(LOCATION_SERVICE) as LocationManager
    }
}