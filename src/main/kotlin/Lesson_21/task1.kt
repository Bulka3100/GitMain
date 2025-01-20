package org.example.Lesson_21

fun main() {
    val string = Stringer("hello")
    string.vowelCount(string)
}

class Stringer(
    val message: String
) {

}

fun Stringer.vowelCount(string: Stringer) {
    var counter: Int = 0
    val message: String = string.message
    for (i in message) {
        when (i) {
            'a' -> counter += 1
            'e' -> counter += 1
            'i' -> counter += 1
            'o' -> counter += 1
            else -> counter += 0
        }
    }
    println(counter)
}