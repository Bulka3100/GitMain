package org.example.Lesson_10

fun main() {
    val ingredients = listOf<String>("лук","картошка","молоко")
    println("в рецепте есть следующие ингредиенты: $ingredients")
    ingredients.forEach{println(it)}
}