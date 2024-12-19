package org.example.Lesson_14

fun main() {
    val liner = Liner(name = "Лайнер")
    val load = Load(name = "грузовой", loadCapacity = 220) //почему в итоге speed=220? как оставить некоторые параметры родительского а некоторые переопределить правильно?
    val iceBreaker = IceBreaker(name = "ледокол")

    println(liner.name)
    println(liner.speed)
    println(liner.loadCapacity)
    liner.runSystemDiagnostic()
    println()
    println(load.name)
    println(load.speed)
    println(load.loadCapacity)
    load.runSystemDiagnostic()
    println()
    println(iceBreaker.name)
    println(iceBreaker.speed)
    println(iceBreaker.loadCapacity)
    println()
    println(load.speed)

}


open class Liner(
    val name: String = "d",
    val speed: Int = 100,
    val loadCapacity: Int = 120,
    val personCapacity: Int = 10,
) {
    open fun runSystemDiagnostic() {
        println("$name: проверены системы коробля ")
    }
}

class Load(
    name: String,
    loadCapacity: Int,


    ) : Liner(name, loadCapacity) {
    override fun runSystemDiagnostic() {
        super.runSystemDiagnostic()
        println("$name: проверено состояние грузовых отсеков")
    }

    fun weightCheck() {
        println("$name: проверено состояние груза")
    }
}

class IceBreaker(
    name: String,
    speed: Int = 70,
    loadCapacity: Int = 100,
    personCapacity: Int = 6,
) : Liner(name, speed, loadCapacity, personCapacity) {
    fun breakIce() {
        println("лёд расколот")
    }
}