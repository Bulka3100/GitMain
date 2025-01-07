package org.example.Lesson_16

fun main() {
    val player = Player("Hero", 10, 5)
    player.getDamage()
    player.getDamage()
    player.heal()
    player.getDamage()

}

class Player(
    val name: String,
    private var hp: Int = 10,
    var punchPower: Int,

    ) {
    init {
        require(hp > 0) { "хп больше 0" }
        println("удачного приключения!")
    }

    fun heal() {
        if (hp > 0 && hp < maxHeal) {
            val ininialHp = hp
            hp += healValue
            println("${name}: лечение hp=$hp")
        } else return
    }

    fun getDamage() {
        hp -= atackValue
        println("${name}: получен урон hp=$hp")
        if (hp <= 0) {
            dead()
        }
    }

    private fun dead() {

        println("${name}: умер")
        punchPower = 0

    }

    companion object {
        val healValue = 4
        val atackValue = 5
        val maxHeal = 10
    }
}
// тут хотелось бы как-то сделать ограничение чтоб хп не было меньше 0 и улучшить условие на максимальный хил, так как в текущий условиях если я изменю в конструкторе hp то условие отработает некорректно
//так и не понял разницу с protected, так как не испольховал