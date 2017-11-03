package com.jj.commutejourney.viewmodel

import android.arch.lifecycle.ViewModel
import android.app.Application
import android.arch.lifecycle.ViewModelProvider
import com.jj.commutejourney.service.BusStopsService


class BusTimesViewModel : ViewModel() {

    fun getNextOutboundBusTimes() {

        val actocode = BusStopsService.getClosestBusStop(1.0, 1.0)
    }
}