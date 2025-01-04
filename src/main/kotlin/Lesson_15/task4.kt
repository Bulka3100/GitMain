package org.example.Lesson_15

import kotlin.collections.forEach

fun main() {
    val guitar = Instruments("guitar", 3)
    val strings = Accessories("strings", 4)
    val mediator = Accessories("mediator", 45)
    guitar.addAccessory(strings)
    guitar.addAccessory(mediator)
    guitar.find(strings) //как я понял не важно что за предсет, влияет на вывод только то, что в аргументе функции
    guitar.findAccessories()
}

abstract class Item(
    val name: String,
    val quantity: Int,
) {
    override fun toString(): String {
        return name
    }
}

class Instruments(
    name: String,
    quantity: Int,
    val acceptableAccessories: MutableList<Accessories> = mutableListOf<Accessories>(),
) : Item(name, quantity), FindItem {
    fun findAccessories() {
        println("список аксессуаров")
        acceptableAccessories.forEach { println(it) }
    }

    fun addAccessory(item: Accessories) {
        acceptableAccessories.add(item)
    }

    override fun find(item: Item) {
        println("выполняется поиск")
        super.find(item)

    }
}

class Accessories(
    name: String,
    quantity: Int
) : Item(name, quantity)

interface FindItem {
    fun find(item: Item) { //можно ли передать сюда item.name как-то?
        println("найден предмет $item в количестве ${item.quantity}")
    }
}
