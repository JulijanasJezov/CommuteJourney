package com.jj.commutejourney.di

import android.content.Context
import dagger.Provides
import javax.inject.Singleton
import com.jj.commutejourney.App
import dagger.Module


@Module
class AppModule {

    @Provides
    internal fun provideContext(application: App): Context {
        return application.applicationContext
    }

}