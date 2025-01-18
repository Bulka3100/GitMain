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
    var ammo: Ammo = Ammo.NO_AMMO
) {
    fun getNewAmmmo(newAmmo: Ammo) {
        ammo = newAmmo
    }

    fun shoot() {
        when (ammo) {
            Ammo.BLUE -> println("нанесено $blueDamage урона")
            Ammo.GREEN -> println("нанесено $greenDamage урона")
            Ammo.RED -> println("нанесено $redDamage урона")
            else -> "нет патронов"
        }
    }

    companion object {
        val blueDamage = 5
        val redDamage = 20
        val greenDamage = 10
    }
}

enum class Ammo {
    BLUE,
    GREEN,
    RED,
    NO_AMMO,
}