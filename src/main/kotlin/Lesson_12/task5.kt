package org.example.Lesson_12

import kotlin.random.Random


fun main() {
    val weatherList = mutableListOf<Weather>()
    for (i in 1..30) {
        val dayTemp: Int = Random.nextInt(270, 293)
        val nightTemp: Int = Random.nextInt(269, 290)
        val isRain: Boolean = Random.nextBoolean()
        weatherList.add(Weather(dayTemp, nightTemp, isRain))

    }
    val night = weatherList.map { it.dayTemp }
    val day = weatherList.map { it.nightTemp }
    val rain = weatherList.count { it.isRain }
    println(weatherList.map { (it.dayTemp + it.nightTemp) / 2 }.average())

}

class Weather(
    _dayTemp: Int,
    _nightTemp: Int,
    _isRain: Boolean,
) {
    var dayTemp = _dayTemp - 273
    var nightTemp = _nightTemp - 273
    var isRain = _isRain

    fun showAll() {
        println("днём $dayTemp вечером $nightTemp")

    }
}