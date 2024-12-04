package org.example.Lesson_8

fun main() {
    val listOfIngredients = arrayOf("egg", "rice", "milk")
    val ingredient = readlnOrNull()
    for (i in listOfIngredients) {
        if (i == ingredient) println("есть в списке") else "нет в списке"

    }
}