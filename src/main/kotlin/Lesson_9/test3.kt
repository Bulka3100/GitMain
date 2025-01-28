package org.example.Lesson_9

fun main() {
    val ingredients = listOf<String>("Яица", "молоко", "сливочное масло")
    val quantityOfIngredients = listOf<Int>(2, 50, 15)
    println("сколько порций?")
    val choice = readln().toInt()
    println("на $choice порций нужно")
    val newCollection = quantityOfIngredients.map { it * choice }.zip(ingredients) { a, b -> "$a-$b" }
    for (i in newCollection) println(i)

}
