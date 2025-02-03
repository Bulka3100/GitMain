package org.example.Lesson_12

fun main() {
    val November15 = Weather(
        _dayTemp = 290,
        _nightTemp = 287,
    )
    November15.showAll()
}

class Weather(
    _dayTemp: Int,
    _nightTemp: Int,
) {
    var dayTemp = _dayTemp - 273
    var nightTemp = _nightTemp - 273
    fun showAll() {
        println("днём $dayTemp вечером $nightTemp")
    }
}
