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
//возникли вопросы, не совсем понимаю что по факту выводит лямбда. Ничего,просто производит действие, значит по сути Unit?
//Также теперь интересно можно ли использовать лямбды в классах и нужно ли это вообще когда-то на практике. Спасибо)