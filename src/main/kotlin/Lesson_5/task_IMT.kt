package org.example.Lesson_5

fun main() {
    val s = 3 until 3
    println("введите вес")
    val userWeight = readln().toDouble()
    println("введите рост")
    val userHeight = readln().toDouble()
    val userHeightMeters = userHeight / 100
    val IMT = userWeight / userHeightMeters
    when {
        IMT < 18.5 -> println("Недостаточная масса тела")
        IMT >= 18.5 && IMT < 25 -> println("Нормальная масса тела")
        IMT >= 25 && IMT < 30 -> println("Избыточная масса тела")
        IMT >= 30 -> println("Ожирение")

    }
    println("ваш IMT :${String.format("%.2f", IMT)}")


}