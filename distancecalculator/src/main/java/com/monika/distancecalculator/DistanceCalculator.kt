package com.monika.distancecalculator

class DistanceCalculator {
    companion object {
        private val EARTH_RADIUS_IN_KILOMETERS = 6371
        fun calculateDistance(
            pointA: Points,
            pointB: Points
        ): Float {

            val dLat = Math.toRadians(pointB.mLatitude - pointA.mLatitude)

            val dLng = Math.toRadians(pointB.mLongitude - pointA.mLongitude)

            val a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(pointA.mLatitude)) *
                    Math.cos(Math.toRadians(pointB.mLatitude)) *
                    Math.sin(dLng / 2) * Math.sin(dLng / 2)

            val c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))

            return (EARTH_RADIUS_IN_KILOMETERS * c).toFloat()
        }
    }

}