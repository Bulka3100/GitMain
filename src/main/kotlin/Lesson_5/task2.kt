package org.example.Lesson_5

fun main() {
    val birthYear = readlnOrNull()!!.toInt()
    val age = CURRENT_YEAR - birthYear
    if (age >= IS_ADULT) println("показать 200скрытый content") else println("подрасти")
}

const val CURRENT_YEAR: Short = 2024
const val IS_ADULT: Int = 18