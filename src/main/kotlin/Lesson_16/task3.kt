package org.example.Lesson_16

fun main() {
    val user1 = User("loshka", "Bulorg")
    user1.validation("loshka")
}

class User(
    private val password: String,
    val login: String,
) {
    fun validation(input: String): Boolean {
        if (input == password) {
            println("верно")
            return true
        } else return false
    }
}
