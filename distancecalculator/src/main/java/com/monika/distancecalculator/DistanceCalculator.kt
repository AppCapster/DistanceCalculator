package com.monika.distancecalculator

import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

class DistanceCalculator {
    companion object {
        private const val EARTH_RADIUS_IN_KILOMETERS = 6371
        fun calculateDistance(
            pointA: Points,
            pointB: Points
        ): Float {

            val dLat = Math.toRadians(pointB.mLatitude - pointA.mLatitude)

            val dLng = Math.toRadians(pointB.mLongitude - pointA.mLongitude)

            println("Latitude $dLat and Longitude $dLng")

            val a = sin(dLat / 2) * sin(dLat / 2) + cos(Math.toRadians(pointA.mLatitude)) *
                    cos(Math.toRadians(pointB.mLatitude)) *
                    sin(dLng / 2) * sin(dLng / 2)

            val c = 2 * atan2(sqrt(a), sqrt(1 - a))

            return (EARTH_RADIUS_IN_KILOMETERS * c).toFloat()
        }
    }
}