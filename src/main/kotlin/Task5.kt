package org.example.Lesson_1

fun main() {

    val quantityOfSeconds: Short = 6480
    val minutes = (quantityOfSeconds / inMinute) - inMinute
    var hours: Int = quantityOfSeconds / inMinute / inMinute
    var seconds: Int = quantityOfSeconds - minutes * inMinute - hours * inMinute * inMinute
    println("%02d:%02d:%02d".format(hours,minutes,seconds))

}

const val inMinute = 60

