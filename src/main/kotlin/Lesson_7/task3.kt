package org.example.Lesson_7

fun main() {
    val number = readln().toInt()
    val range = 0..number step 2
    for (i in range) println(i)
}