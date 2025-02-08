package org.example.Lesson_22

fun main() {
    val regularBook = RegularBook("1984", "Джордж Оруэл")
    val dataBook = DataBook("Фауст", "Гётте")
    println(regularBook) //выдаёт строковое представление объекта по умолчанию
    println(dataBook) // при вызове println под копотом вызывается метод toString, в Data class он переопределён
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)