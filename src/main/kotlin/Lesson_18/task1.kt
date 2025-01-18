package org.example.Lesson_18


fun main() {
    val order = Order(1)
    val order1 = Order(2)
    order.printOrderInfo("ball")
    order1.printOrderInfo(listOf<String>("eggs", "sugar"))
}

class Order(
    val id: Int,

    ) {
    fun printOrderInfo(item: String) {
        println("Заказан товар: $item")
    }

    fun printOrderInfo(items: List<String>) {
        println("Заказаны товары: ${items.joinToString(", ")}")
    }
}
// не нравится что не получилось создать свойства для типов товаров, чтобы изначально в конструктор писать товар, а потом уже выводить его содержимое по случаю

