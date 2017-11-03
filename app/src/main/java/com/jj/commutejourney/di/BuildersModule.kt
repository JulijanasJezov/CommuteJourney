package com.jj.commutejourney.di

import com.jj.commutejourney.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class BuildersModule {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    internal abstract fun bindMainActivity(): MainActivity

}