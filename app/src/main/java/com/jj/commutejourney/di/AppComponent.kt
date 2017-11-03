package com.jj.commutejourney.di

import android.app.Application
import com.jj.commutejourney.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        BuildersModule::class
))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}