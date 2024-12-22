package org.example.Lesson_5

fun main() {
    println("угадай число от 1 до 42")
    val input1 = readlnOrNull()?.toInt()
    val input2 = readlnOrNull()?.toInt()
    var choosed: Int = 0
    when (input1) {
        FIRST -> choosed++
        SECOND -> choosed++
        else -> choosed
    }
    when (input2) {
        FIRST -> choosed++
        SECOND -> choosed++
        else -> choosed
    }
    when (choosed) {
        2 -> println("Вы выйграли главный приз")
        1 -> println("Вы выйграли утешительныйф приз")
        0 -> println("Неудача!")

    }
}

const val FIRST: Int = 4
const val SECOND: Int = 22
