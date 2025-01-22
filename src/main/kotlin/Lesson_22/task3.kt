package org.example.Lesson_22

fun main() {
    val player = Player(100, 50, 75)
    val (damage1, hp1, mana1) = player
    println(damage1)
    println(hp1)
    println(mana1)

}

data class Player(
    val damage: Int,
    val hp: Int,
    val mana: Int,
)
//для пропуска символ _