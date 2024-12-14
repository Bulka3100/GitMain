package org.example.Lesson_11


fun main() {

}

class Recipe(
    val recipeName: String,
    val id: Int,
    var inFavorites: Boolean = false,
    val recipePhoto: String = "default.png",
    val description: String = ""
) {
    fun addToFavorites() {
        inFavorites = true
    }
}


class RecipeCategory(
    val categoryName: List<String> = listOf<String>("Бургеры", "Десерты", "Пицца", "Рыба"),
    val categoryPhoto: String = "default.png"
)

class Ingredient(
    val ingId: Int,
    val ingName: String,
    val ingState: List<String> = listOf<String>("solid", "liquid")
)

fun forPortions(numberOfPortions: Int, ingQuantity: Int): Int {
    val result = numberOfPortions * ingQuantity
    return result
}