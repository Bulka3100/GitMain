package org.example.Lesson_20

fun main() {
    val player1 = Player("Denis")
    openDoor(player1)
    player1.findKey()
    openDoor(player1)

}

val openDoor: (Player) -> Unit = { player: Player ->
    if (player.hasKey == false)
        println("дверь не поддаётся")
    else println("дверь открыта")
}

class Player(
    val name: String,
    var hasKey: Boolean = false
) {
    fun findKey() {
        println("Игрок $name нашел ключ")
        hasKey = true
    }
}
