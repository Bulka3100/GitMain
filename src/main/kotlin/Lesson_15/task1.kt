package org.example.Lesson_15

fun main() {
    val seagull = Seagull()
    val fish = Fish()
    val duck = Duck()
    seagull.toMove()
    duck.toMove()
    fish.toMove()
}

class Fish() : Movable {
    override fun toMove() {
        println("плывёт")
    }
}

class Duck() : Movable {
    override fun toMove() {
        println("плывёт и ходит")
    }
}

class Seagull() : Movable {
    override fun toMove() {
        println("ходит")
    }
}

interface Movable {
    fun toMove()
}