package org.example.Lesson_12

fun main() {

    val November15 = Weather(
        dayTemp = 13,
        nighttemp = 11,
        isRainfall = true
    )
    November15.showAll()
}

class Weather(
    var dayTemp: Int,
    var nighttemp: Int,
    var isRainfall: Boolean
) {
    fun showAll() {
        println("днём $dayTemp вечером $nighttemp осадки:$isRainfall")
    }
}// спросить это я сделал используя определение свойств в основном конструкторе или нужно было оставить  в теле переменные и сделать на них ссылки в конструкторе типо name = _name?
