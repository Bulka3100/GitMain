package org.example.Lesson_12

import kotlin.random.Random


fun main() {
    val weatherList = mutableListOf<Weather>()

    for (i in 1..30) {
        val dayTemp: Int = Random.nextInt(10, 40)
        val nightTemp: Int = Random.nextInt(8, 30)
        val isRain: Boolean = Random.nextBoolean()
        weatherList.add(Weather(dayTemp, nightTemp, isRain))
    }
    val night = weatherList.map { it.dayTemp }
    val day = weatherList.map { it.nightTemp }
    val rain = weatherList.count{it.isRain}
    println(night)
    println(day)
}

fun Iterable<Int>.calculateAverage(): Double {
    if (isEmpty()) return 0.0
    return sum().toDouble() / size
}

class Weather(
    _dayTemp: Int,
    _nightTemp: Int,
    _isRain: Boolean,
) {
    var dayTemp = _dayTemp
    var nightTemp = _nightTemp
    var isRain = _isRain

    fun showAll() {
        println("днём $dayTemp вечером $nightTemp")

    }
}//в блоке инит у нас происходит любой код что мы напишем и он выполняется когда мы создаем объект?