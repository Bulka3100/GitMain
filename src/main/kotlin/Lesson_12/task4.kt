package org.example.Lesson_12

fun main() {

    val November15 = Weather(
        _dayTemp = 13,
        _nightTemp = 11,
    )
}

class Weather(
    _dayTemp: Int,
    _nightTemp: Int,
) {
    var dayTemp=_dayTemp
    var nightTemp=_nightTemp
    init {
        println("днём $dayTemp вечером $nightTemp")
    }
    fun showAll() {
        println("днём $dayTemp вечером $nightTemp")

    }
}