package org.example.Lesson_2

import kotlin.math.pow

fun main() {
    val summ = 70_000
    val procent = 16.7
    val time = 20
    val result = (summ * ((1 + procent / 100).pow(time))).toDouble()
    val formatResult = Math.round(result * 1000.0) / 1000.0
    println(formatResult)

}