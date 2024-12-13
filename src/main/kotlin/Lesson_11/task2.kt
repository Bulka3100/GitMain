package org.example.Lesson_11

fun main() {

}

class User2(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
    val bio: String = "",
) {
    fun userData(){
        println()
    }
    fun changePass() {
        println("введите текущий пароль")
        val ininialPass = readln()
        if (ininialPass == password) {
            var newPass = readln()
            newPass = password
        }
    }
}
