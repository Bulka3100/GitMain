package org.example.Lesson_19

fun main() {
    val product = Product("shirt", 2, Category.CLOTHES)
    product.getInfo()
}

enum class Category() {
    CLOTHES {
        override fun getDescription(): String {
            return "Одежда любых размеров"
        }

    },
    DIFFERENT {
        override fun getDescription(): String {
            return "От книг до товаров для дома"
        }
    },
    CHANCELLERY {
        override fun getDescription(): String {
            return "пишущие принадлежности"
        }
    };

    abstract fun getDescription(): String

}

class Product(
    val name: String,
    val id: Int,
    val category: Category
) {
    fun getInfo() {
        println("название $name, айди $id, категория ${category.getDescription()}")
    }
}
