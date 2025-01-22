package org.example.Lesson_22

fun main() {
    val regularBook1 = RegularBook("Автостопом по галактике", "Роман Адамс")
    val regularBook2 = RegularBook("Автостопом по галактике", "Роман Адамс")
    val dataBook1 = DataBook("Заводной апельсин", "Энтони Берджесс")
    val dataBook2 = DataBook("Заводной апельсин", "Энтони Берджесс")
    println(regularBook2 == regularBook1) //тут в сравнение идут не свойства объекта, их хэшкоды, которые различаются при создании (ссылки на объекты)
    println(dataBook2 == dataBook1) // в датакллассе сравниваются именно данные объектов
}

class RegularBook(
    val name: String,
    val author: String,
) {

}

data class DataBook(
    val name: String,
    val author: String,
)