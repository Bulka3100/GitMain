package org.example.Lesson_18

fun main() {
    val dog = Dog("Шарик")
    val fox = Fox("Алиса")
    val cat = Cat("Мурзик")
    val TamoList: List<TamoAnimal> = listOf<TamoAnimal>(cat, dog, fox)
    for (i in TamoList) {
        i.eat()
    }
}

abstract class TamoAnimal(
    val name: String,
    val food: String,
) {
    open fun eat() {
        println("$name ->съел $food")
    }

    open fun sleep() {
        println("$name ->спит")
    }
}

class Fox(
    name: String,
    food: String = "ягоды",
) : TamoAnimal(name, food) {
    override fun eat() {
        println("$name ->съел $food и что-то сказала")
    }

}

class Dog(
    name: String,
    food: String = "кости",
) : TamoAnimal(name, food) {
    override fun eat() {
        println("$name ->съел $food и завилял хвостом")
    }
}

class Cat(
    name: String,
    food: String = "рыба",
) : TamoAnimal(name, food) {
    override fun eat() {
        println("$name ->съел $food и замурлыкал")
    }

}

