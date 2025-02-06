package org.example.Lesson_16

fun main() {
    val circle = Circle(4)
    println(Circle(2).calcP())
    println(circle.calcS())
}

class Circle(
    private val radius: Int
) {
    fun calcP(): Double {
        return P * 2 * radius
    }

    fun calcS(): Double {
        return P * radius * radius
    }
}
private const val P = 3.14

