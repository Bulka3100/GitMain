package org.example.Lesson_1

fun main() {

    val quantityOfSeconds: Short = 6485
    val minutes = (quantityOfSeconds / 60) - 60 // понимаем минут остаётся
    var hours: Int = quantityOfSeconds / 60 / 60
    var seconds: Int = quantityOfSeconds - minutes * 60 - hours * 3600

    println("0$hours:$minutes:0$seconds")

}


