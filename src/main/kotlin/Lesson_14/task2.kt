package org.example.Lesson_14

fun main() {
    val liner = Basic()
    val icebreaker = IceBreak()
    val load = Loader()
    liner.toLoad()
    icebreaker.toLoad()
    load.toLoad()
    liner.showInfo()

}

open class Basic(
    val name: String = "liner",
    val speed: Int = 100,
    val loadCapacity: Int = 120,
    val personCapacity: Int = 10,
) {
    open fun runSystemDiagnostic() {
        println("$name: проверены системы коробля ")
    }

    open fun toLoad() {
        println("$name: выдвинуть трап")
    }

    fun showInfo() {
        println("параметры коробля :\n Название:$name\n скорость:$speed\n грузоподъёмность:$loadCapacity\n вместительность:$personCapacity")
    }
}

class Loader(
    name: String = "грузовой",
    speed: Int = 80,
    loadCapacity: Int = 120,
) : Basic(name, speed = speed, loadCapacity = loadCapacity) {
    override fun toLoad() {
        println("$name: активировать погрузочный кран")
    }
}
// почему при добавлении логики в init все ломается?

class IceBreak(
    name: String = "ледокол",
    speed: Int = 70,
    loadCapacity: Int = 40,
) : Basic(name, speed = speed, loadCapacity = loadCapacity) {
    fun iceBreak() {
        println("лед расколот")
    }

    override fun toLoad() {
        println("$name: открыть ворота со стороны кормы")
    }
}
