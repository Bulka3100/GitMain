package org.example.Lesson_3

fun main() {
    val stringFormated: String = "D2-D4;0"
    val separated = stringFormated.split("-", ";")
    val from = separated[0]
    val  to = separated[1]
    val nubmerOfMove = separated[2]
    println(from)
    println(to)
    println(nubmerOfMove)
}
