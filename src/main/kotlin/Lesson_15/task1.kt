package org.example.Lesson_15

fun main() {
    val seagull = Seagull()
    val fish = Fish()
    val duck = Duck()
    seagull.toFly()
    duck.toSwim()
    duck.toFly()
    fish.toSwim()
}

class Fish() : Swim
class Duck() : Swim, Fly
class Seagull() : Fly

interface Fly {
    fun toFly() {
        println("летает")
    }
}

interface Swim {
    fun toSwim() {
        println("плывёт")
    }
}