package org.example.Lesson_10

fun main() {
    val firstRobot = throwBone()
    println("машина: $firstRobot")
    val secondHuman = throwBone()
    println("Человек: $secondHuman")
    if (firstRobot > secondHuman) println("Победила машина")
    else if (firstRobot < secondHuman) println("Победило человечество")
    else println("Победила дружба")
}

fun throwBone(): Int {
    println("бросок кости")
    val dust = 1..6
    val randomThrow = dust.random()
    return randomThrow
}

