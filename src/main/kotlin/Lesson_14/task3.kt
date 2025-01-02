package org.example.Lesson_14

fun main() {
    val rectangle1 = Rectangle(12, 2, "Black")
    val circus1 = Circus(2, "Black")
    val rectangle2 = Rectangle(7, 42, "White")
    val circus2 = Circus(5, "White")
    val figureList = listOf<Figure>(circus2, circus1, rectangle2, rectangle1)
    for (figure in figureList){
        println(figure.javaClass.simpleName)
    }
    var whiteSum = 0
    var blackSum = 0

    for (i in figureList) {
        if (i.color == "White") {
            whiteSum += i.calculatingS()
        } else if (i.color == "Black") {
            blackSum += i.calculatingP()
        }
    }
    println("сумма площадей белых: $whiteSum")
    println("сумма периметров  черных: $blackSum")
}

abstract class Figure(
    val color: String
) {
    abstract fun calculatingS(): Int
    abstract fun calculatingP(): Int
}

class Rectangle(
    val width: Int,
    val height: Int,
    color: String
) : Figure(color) {
    override fun calculatingS(): Int {
        return (width * height)
    }

    override fun calculatingP(): Int {
        return (width + height) * 2
    }
}

class Circus(
    val radius: Int,
    color: String,
) : Figure(color) {
    override fun calculatingS(): Int {
        return (radius * radius) * P
    }

    override fun calculatingP(): Int {
        return (2 * P * radius)
    }
}

const val P = 3 //А как быть если бы я принял 3.14? функция же возвращает Int? Какой самый быстрый путь решения?