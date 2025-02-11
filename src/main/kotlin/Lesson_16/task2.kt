package org.example.Lesson_16

fun main() {
    val circle = Circle(4)
    println(Circle(2).calcPerimeter())
    println(circle.calcArea())
}

class Circle(
    private val radius: Int
) {
    fun calcPerimeter(): Double {
        return P * 2 * radius
    }

    fun calcArea(): Double {
        return P * radius * radius
    }
}
private const val P = 3.14

