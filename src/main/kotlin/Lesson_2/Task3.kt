package org.example.Lesson_2

fun main() {
    val hours = 9
    val minutes = 39
    val startTime = hours * SECONDS_IN_MINUTE + minutes
    val arrivalTimeMinutes = startTime + TRAVEL_TIME
    val arrivalTimeHours = arrivalTimeMinutes / SECONDS_IN_MINUTE
    val arrivalTimeMinutesLeft = arrivalTimeMinutes % SECONDS_IN_MINUTE
    val arrivalTime: String = String.format("%02d:%02d", arrivalTimeHours, arrivalTimeMinutesLeft)
    println(arrivalTime)
}

const val TRAVEL_TIME = 457
const val SECONDS_IN_MINUTE = 60