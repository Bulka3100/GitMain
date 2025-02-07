package org.example.Lesson_17

fun main() {
    val ship= Ship()
    ship.avverageSpeed=11
    println(ship.avverageSpeed)
    ship.name= "беда"
    println(ship.name)
}
class Ship{
    var name: String="Победа"
        set(value){
            if(value!=field)
            println("беда, нельзя перезаписать)")
        }
    var avverageSpeed:Int =10
    val port: Int=1
}