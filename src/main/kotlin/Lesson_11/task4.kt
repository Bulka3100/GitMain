package org.example.Lesson_11


fun main() {


}

class Recipe(
    val recipeName: String,
    val id: Int,
    var inFavorites: Boolean = false,
    val recipePhoto: String = "default.png",
    val description: String = "",
    val ingredientList: List<Ingredient> =mutableListOf<Ingredient>()
) {
    fun addToFavorites() {
        inFavorites = true
    }
}


class RecipeCategory(
    var currentCategory : String= "Бургеры",
    val categoryPhoto: String = "default.png",
    val listOfRecipe: List<Recipe> = mutableListOf<Recipe>(),
){
    fun changeCurrent(categoryVariety: CategoryVariety){
        when(categoryVariety){
            CategoryVariety.BURGERS -> currentCategory = "Бургеры"
            CategoryVariety.DESERT -> currentCategory = "Десерты"
            CategoryVariety.PIZZA -> currentCategory = "Пица"
            CategoryVariety.FISH -> currentCategory = "Рыба"
        }
    }
}

class Ingredient(
    val ingId: Int,
    val ingName: String,
    val ingState: List<String> = listOf<String>("solid", "liquid")
)

fun forPortions(numberOfPortions: Int, ingQuantity: Int): Int {
    val result = numberOfPortions * ingQuantity
    return result
}
enum class CategoryVariety{
    BURGERS,
    DESERT,
    PIZZA,
    FISH,
}
