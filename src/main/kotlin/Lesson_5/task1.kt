package org.example.Lesson_5

fun main() {

    val firstValue = 2
    val secondValue = 3
    println("решите пример: $firstValue+$secondValue")
    val identificator = readlnOrNull()?.toInt()
    if (identificator == firstValue + secondValue) println("Добро пожаловать") else println("доступ запрещен")

}
