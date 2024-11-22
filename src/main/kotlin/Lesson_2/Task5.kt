package org.example.Lesson_2

import java.text.Format
import kotlin.math.pow

fun main() {
    val summ = 70_000
    val procent = 16.7
    val time = 20
    val result = (summ * ((1 + procent / 100).pow(time))).toDouble()
    val formated = ("%.3f".format(result))
    println(formated)


}