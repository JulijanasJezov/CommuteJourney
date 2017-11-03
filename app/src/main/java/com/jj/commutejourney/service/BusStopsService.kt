package com.jj.commutejourney.service


import com.jj.commutejourney.model.BusStop


object BusStopsService {

    private val busStops = mutableListOf(
            BusStop.create("Victoria Centre", "3390W3", 52.95513, -1.14691),
            BusStop.create("Angel Row A1", "3390A1", 52.95367, -1.15227),
            BusStop.create("Maid Marian Way", "3390M1", 52.9529, -1.15361),
            BusStop.create("Collin Street", "3390C4", 52.949673, -1.14894),
            BusStop.create("Nottingham Railway Station", "3390S1", 52.94806, -1.14756),
            BusStop.create("Arkwright Street", "3390ME01", 52.94604, -1.14663),
            BusStop.create("Bridgeway Centre", "3390ME20", 52.9432, -1.14743),
            BusStop.create("Wilford Crescent", "3390ME37", 52.94054, -1.14563),
            BusStop.create("Holgate Road", "3390ME38", 52.93858, -1.14538),
            BusStop.create("Collygate Road", "3390ME39", 52.93829, -1.1436),
            BusStop.create("Bunbury Street", "3390ME71", 52.93879, -1.14173),
            BusStop.create("Victoria Embankment", "3390ME05", 52.93947, -1.13792),
            BusStop.create("Cricket Ground", "3390W3", 52.93762, -1.13395),
            BusStop.create("Fox Road", "3300RU0473", 52.93821, -1.13083),
            BusStop.create("Woodland Road", "3300RU0518", 52.93872, -1.12479),
            BusStop.create("Primary School", "3300RU0517", 52.93845, -1.12024),
            BusStop.create("Gertrude Road", "3300RU0516", 52.93824, -1.11665),
            BusStop.create("Seymour Road", "3300RU0514", 52.9381, -1.11392),
            BusStop.create("Turning Circle", "3300RU0512", 52.93863, -1.11179)
    )

    fun getClosestBusStop(latitude: Double, longitude: Double): String {
        var busStopActocode = "3390W3"
        var smallestDistance = 999999.9

        for (busStop: BusStop in busStops) {
            val distance = distance(latitude, longitude, busStop.latitude(), busStop.longitude())

            if (distance < smallestDistance) {
                smallestDistance = distance
                busStopActocode = busStop.atcocode()
            }
        }
        return busStopActocode
    }

    private fun distance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
        val theta = lon1 - lon2
        var dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta))
        dist = Math.acos(dist)
        dist = rad2deg(dist)

        return dist * 60.0 * 1.1515
    }

    private fun deg2rad(deg: Double): Double {
        return deg * Math.PI / 180.0
    }

    private fun rad2deg(rad: Double): Double {
        return rad * 180.0 / Math.PI
    }

}