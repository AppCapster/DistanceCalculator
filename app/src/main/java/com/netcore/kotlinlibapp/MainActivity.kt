package com.netcore.kotlinlibapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.monika.distancecalculator.DistanceCalculator
import com.monika.distancecalculator.Points

class MainActivity : AppCompatActivity() {

    val point1_lat = -34.6037389
    val point1_long = -58.3815704
    val point2_lat = 40.6892944
    val point2_long = -74.0445004

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("distanceBetweenPoints: 1")
        val buenosAiresObeliscoPoint = Points(point1_lat, point1_long)
        val nycStatueOfLibertyPoint = Points(point2_lat, point2_long)
        val distanceBetweenPoints =
            DistanceCalculator.calculateDistance(buenosAiresObeliscoPoint, nycStatueOfLibertyPoint)
        print("distanceBetweenPoints: $distanceBetweenPoints")
        Log.v("Files",distanceBetweenPoints.toString())
    }
}
