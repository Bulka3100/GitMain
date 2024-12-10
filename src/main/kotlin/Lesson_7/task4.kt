package org.example.Lesson_7

fun main() {
    println("введите количество секунд")
    val x = readlnOrNull()!!.toInt()
    val range = x downTo 1
    for (i in range) {
        println("осталось секунд $i")
        Thread.sleep(1000)
    }

    println("время вышло")
}