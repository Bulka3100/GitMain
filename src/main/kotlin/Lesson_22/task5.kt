package org.example.Lesson_22

import java.sql.Date
import java.time.LocalDateTime

fun main() {
    val data = LocalDateTime.of(2023, 10, 15, 12, 0)
    val alpha_Centauri = GalacticGuide("Alpha Centauri", "Planet for living", data, 2000)
    val (name, description, time, long) = alpha_Centauri
    println(name)
    println(description)
    println(time)
    println(long)
    // если только о месте то можно использовать _
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val time: LocalDateTime,
    val longInLightYears: Int
)

