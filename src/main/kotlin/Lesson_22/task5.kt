package org.example.Lesson_22

import java.sql.Date

fun main() {
    val data: Date = Date(1)
    val alpha_Centauri = GalacticGuide("Alpha Centauri", "Planet for living", data, 2000)
    val (name, description, time, long) = alpha_Centauri
    println(name)
    println(description)
    println(time)
    println(long)
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val time: Date,
    val longInLightYears: Int
)

