package org.example.Lesson_18

fun main() {
    val cube= Cube(3)
    val rectangle= Rectangle(2,3,6)
    println(cube.findS())
    println(rectangle.findS())
}

abstract class Package() {
    abstract fun findS(): Int
}

class Rectangle(
    val height:Int,
    val width:Int,
    val length: Int,
): Package() {
    override fun findS(): Int {
        return 2*(height*width+width*length+height*length)
    }

}
class Cube(
    val edgeLength: Int
): Package() {
    override fun findS(): Int {
        return 6*edgeLength*edgeLength
    }
}
//не уверен что это полиморфизм