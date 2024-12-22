package org.example.Lesson_5

fun main() {

    val a = 2
    val b = 3
    println("решите пример: $a+$b")
    val identificator = readlnOrNull()?.toInt()
    if (identificator == a + b) println("Добро пожаловать") else println("доступ запрещен")

}