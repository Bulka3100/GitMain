package org.example.Lesson_14

fun main() {
    val moon = Satellite("moon", true, true)
    val bigR = Satellite("Rbig", false, true)
    val earth = Planet("Earth", true, true, listOf(bigR, moon))
    println(earth.name)
    println(earth.showSatellites())
}

open class SkyObjects(
    val isAtmosphere: Boolean,
    val isSafeForLanding: Boolean
)

class Planet(
    val name: String,
    isAtmosphere: Boolean,
    isSafeForLanding: Boolean,
    val satellites: List<Satellite> = listOf<Satellite>(),
) : SkyObjects(isAtmosphere, isSafeForLanding) {
    fun showSatellites(): String {
        return "Спутники: ${satellites.joinToString(", ") { it.name }}"
    }

}

class Satellite(
    val name: String,
    isAtmosphere: Boolean,
    isSafeForLanding: Boolean
) : SkyObjects(isAtmosphere, isSafeForLanding)
