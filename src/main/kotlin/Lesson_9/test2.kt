package org.example.Lesson_9

fun main() {
    val ingredients = mutableListOf<String>("лук", "морковь", "сгущенка")
    println("в рецепте есть базовые ингредиенты:$ingredients")
    println("желаете добавить ещё?")
    val chosen = readln()
    if (chosen.equals("нет", ignoreCase = true)) {

        println("какой ингридиент добавить?")
        val ingredientNew = readln()
        ingredients.add(ingredientNew)
        println("в рецепте теперь есть ингредиенты:$ingredients")
    } else {
    }
}