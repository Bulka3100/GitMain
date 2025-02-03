package org.example.Lesson_12

fun main() {

    val November15 = Weather(
        _dayTemp = 278,
        _nightTemp = 274,
    )
}

class Weather(
    _dayTemp: Int,
    _nightTemp: Int,
) {
    var dayTemp = _dayTemp - 273
    var nightTemp = _nightTemp - 273

    init {
        showAll()
    }

    fun showAll() {
        println("днём $dayTemp вечером $nightTemp")

    }
}