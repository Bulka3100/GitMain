package org.example.Lesson_7

fun main() {
    val range1 = 1..9
    val range2 = 'a'..'z'
    var password = ""
    for (i in 0..2) {
        password += range1.random()
        password += range2.random()
    }
    println(password)
}

