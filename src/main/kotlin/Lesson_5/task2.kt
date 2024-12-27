package org.example.Lesson_5

fun main() {
    val birthYear = readlnOrNull()?.toInt() ?: return
    val age: Int = CURRENT_YEAR - birthYear
    if (age >= IS_ADULT) println("показать 200скрытый content") else println("подрасти")
}

const val CURRENT_YEAR: Short = 2024
const val IS_ADULT: Byte = 18