package org.example.Lesson_8

fun main() {
    val listOfIngredients = arrayOf("egg", "rice", "milk")
    val ingredient = readlnOrNull()
    if (ingredient in listOfIngredients) println("есть в рецепте") else println("нет")

}