package org.example.Lesson_19

fun main() {
    val tank = Tank()
    tank.shoot()
    tank.getNewAmmmo(Ammo.RED)
    tank.shoot()
    tank.getNewAmmmo(Ammo.GREEN)
    tank.shoot()

}

class Tank(
    var ammo: Ammo? = null
) {
    fun getNewAmmmo(newAmmo: Ammo) {
        ammo = newAmmo
    }

    fun shoot() {
        when (ammo) {
            Ammo.BLUE -> println("нанесено  ${Ammo.BLUE.damage} урона")
            Ammo.GREEN -> println("нанесено ${Ammo.GREEN.damage} урона")
            Ammo.RED -> println("нанесено ${Ammo.RED.damage} урона")
            else -> "нет патронов"
        }

    }
}

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}
