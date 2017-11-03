package com.jj.commutejourney.di

import com.jj.commutejourney.viewmodel.BusTimesViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun providesBusTimesViewModelFactory() : BusTimesViewModelFactory = BusTimesViewModelFactory()
}