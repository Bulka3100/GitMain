package org.example.Lesson_20

fun main() {
    val player1 = Player("Ivan", 10, 7);
    println(player1.currentHp)
    val healing = { player: Player -> player.currentHp += 3 }
    healing(player1)
    println(player1.currentHp)
}

class Player(
    val name: String,
    private val maxHP: Int,
    var currentHp: Int,
)
