package org.example.Lesson_12

fun main() {
    val November12 = Weatherdata()
    November12.dayTemp = 15
    November12.isRainfall = true
    November12.showAll()

    val November14 = Weatherdata()
    November14.showAll()
}


class Weatherdata() {
    var dayTemp = 22
    var nighttemp = 17
    var isRainfall = false
    fun showAll() {
        println("днём $dayTemp вечером $nighttemp осадки:$isRainfall")
    }
    }