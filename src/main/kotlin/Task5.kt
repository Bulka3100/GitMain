package org.example.Lesson_1

fun main() {

    val quantityOfSeconds: Short = 6480
    val minutes = (quantityOfSeconds / inMinute) - inMinute // понимаем минут остаётся
    var hours: Int = quantityOfSeconds / inMinute / inMinute
    var seconds: Int = quantityOfSeconds - minutes * inMinute - hours * inMinute * inMinute
    println("${String.format("%02d", hours)}:${String.format("%02d", minutes)}:${String.format("%02d", seconds)}")

}
const val inMinute = 60

