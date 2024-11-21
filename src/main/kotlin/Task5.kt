package org.example.Lesson_1

fun main() {

    val quantityOfSeconds: Short = 6480
    val minutes = (quantityOfSeconds / QUANTITY_OF_SECONDS) - QUANTITY_OF_SECONDS
    var hours: Int = quantityOfSeconds / QUANTITY_OF_SECONDS / QUANTITY_OF_SECONDS
    var seconds: Int =
        quantityOfSeconds - minutes * QUANTITY_OF_SECONDS - hours * QUANTITY_OF_SECONDS * QUANTITY_OF_SECONDS
    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}

const val QUANTITY_OF_SECONDS = 60

