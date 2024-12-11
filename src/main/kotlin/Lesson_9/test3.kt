package org.example.Lesson_9

fun main() {
    val ingredients = listOf<String>("Яица", "молоко", "сливочное масло")
    val quantityOfIngredients = listOf<Int>(2, 50, 15)
    println("сколько порций?")
    val choice = readlnOrNull()!!.toInt()
    println("на $choice порций нужно")
    for ((i, ingredient) in ingredients.withIndex()) {
        println("$ingredient-${quantityOfIngredients[i] * choice}")
    }
}