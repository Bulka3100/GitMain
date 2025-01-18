package org.example.Lesson_19

fun main() {
    val spaceShip = SpaceShip("shatle", 120)
    spaceShip.toShoot()
    spaceShip.toLand()
    spaceShip.toFly()
}

class SpaceShip(
    val name: String,
    val speed: Int,

    ) {
    fun toFly() {
        //TODO ("описать логику")
    }

    fun toLand() {
        TODO(" тут логика нужна")
    }

    fun toShoot() {
        println("выстрел в астеройды")
    }
}
