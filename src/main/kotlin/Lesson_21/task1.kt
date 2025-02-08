package org.example.Lesson_21

fun main() {
    val string = "barabulka"
   println( string.vowel(string))
}

fun String.vowel(string: String): Int {
    val vowels = listOf<Char>('a', 'e', 'i', 'o')
    return string.count { it in vowels }
}
