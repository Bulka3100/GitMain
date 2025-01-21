package org.example.Lesson_21

fun main() {
    val player1 = Player("Adam", 10, 5)
    val player2 = Player("Jenis", 10, 10)
    println(player1.isHealthy())
    println(player2.isHealthy())

}

class Player(
    val name: String,
    val maxHP: Int,
    var currentHp: Int,
)

fun Player.isHealthy(): Boolean {
    if (this.currentHp == this.maxHP) return true else return false

}