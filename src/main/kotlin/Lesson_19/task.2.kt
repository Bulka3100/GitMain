package org.example.Lesson_19

fun main() {
    val product = Product("shirt", 2, Category.CLOTHES)
    product.getInfo()
}

enum class Category() {
    CLOTHES,
    DIFFERENT,
    CHANCELLERY
}

class Product(
    val name: String,
    val id: Int,
    val category: Category
) {
    fun getInfo() {
        println("название $name, айди $id, категория ${getDescription(category)}")
    }
}

fun getDescription(category: Category): String {
    when (category) {
        Category.CLOTHES -> return "Одежда любых размеров"
        Category.DIFFERENT -> return "От книг до товаров для дома"
        Category.CHANCELLERY -> return "пишущие принадлежности"
    }
}