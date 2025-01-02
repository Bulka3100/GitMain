package org.example.Lesson_14

fun main() {
    val moon = Satellite("moon", true, true)
    val bigR = Satellite("Rbig", false, true)
    val earth = Planet("Earth", true, true, listOf(bigR, moon))
    println(earth.name)
    println(earth.showSatellites())
}

open class SkyObjects(
    val isAutmosphere: Boolean,
    val isSafeForLanding: Boolean
)
class Planet(
    val name: String,
    isAutmosphere: Boolean,
    isSafeForLanding: Boolean,
    val satellites: List<Satellite> = listOf<Satellite>(),
) : SkyObjects(isAutmosphere, isSafeForLanding) {
    fun showSatellites() {
        println("Спутники:")
        satellites.forEach { println(it.name) }
    }
}

class Satellite(
    val name: String,
    isAutmosphere: Boolean,
    isSafeForLanding: Boolean
) : SkyObjects(isAutmosphere, isSafeForLanding)
