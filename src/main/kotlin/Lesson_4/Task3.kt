package org.example.Lesson_4

fun main() {
    val weatherTodaySunny: Boolean = true
    val tentIsOpened: Boolean = true
    val airWet: Int = 20
    val currentTimeOfTheYear: String = "Winter"
    println("Благоприятные ли условия сейчас для роста бобовых? ${weatherTodaySunny == true && tentIsOpened == true && airWet == 20 && currentTimeOfTheYear != "Winter"}")
}
