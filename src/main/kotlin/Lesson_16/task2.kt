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

const val P = 3.14

/*fun calcS(radius: Int): Double {
return P * radius * radius А если я так пишу то получается когда я передаю в функцию хначение радиуса он меняется в самом конструкторе? А как тае если он val? Ошибку не выдвет
}*/