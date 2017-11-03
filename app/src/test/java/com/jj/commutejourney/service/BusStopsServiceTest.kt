package com.jj.commutejourney.service

import org.junit.Assert.*
import org.junit.Test


class BusStopsServiceTest {

    @Test
    fun testGetClosestBusStop() {
        val actocode = BusStopsService.getClosestBusStop(52.95365, -1.15226)
        assertEquals("3390A1", actocode)
    }
}