package org.example.Lesson_7

fun main() {
    val x = readlnOrNull()!!.toInt()
    val range = 0..x
    for (i in range) {
        if (i % 2 == 0) println(i) else continue
    }
}