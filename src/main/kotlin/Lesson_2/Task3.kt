package org.example.Lesson_2

fun main() {
    val startTime = 9 * 60 + 39
    val arrivalTimeMinutes = startTime + travelTime
    val arrivalTimeHours = arrivalTimeMinutes / 60
    val arrivalTimeMinutesLeft = arrivalTimeMinutes % 60
    val arrivalTime: String = ("$arrivalTimeHours:$arrivalTimeMinutesLeft")
    println(arrivalTime)
}
const val travelTime = 457