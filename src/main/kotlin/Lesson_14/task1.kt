package org.example.Lesson_14

fun main() {

    val liner = Liner()
    val load = Load()
    val iceBreaker = IceBreaker()
    println(load.name)
    println(load.personCapacity)
    println(liner.name)
    println(load.speed)
    println(load.loadCapacity)
    println(iceBreaker.iceBreak())
    println(iceBreaker.runSystemDiagnostic())
    println(iceBreaker.speed)
    println(load.runSystemDiagnostic())

}

open class Liner(
    val name: String = "liner",
    val speed: Int = 100,
    val loadCapacity: Int = 120,
    val personCapacity: Int = 10,
) {
    open fun runSystemDiagnostic(): String {
        return "$name: проверены системы коробля"
    }
}

class Load(
    name: String = "грузовой",
    speed: Int = 80,
    loadCapacity: Int = 120,
) : Liner(name, speed, loadCapacity)


class IceBreaker(
    name: String = "ледокол",
    speed: Int = 70,
    loadCapacity: Int = 40,
) : Liner(name, speed, loadCapacity) {
    fun iceBreak(): String {
        return "лед расколот"
    }
}
