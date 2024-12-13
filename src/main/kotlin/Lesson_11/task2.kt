package org.example.Lesson_11

import kotlin.String

fun main() {
    val userPetr = User2(
        id = 1,
        login = "pasha",
        password = "jjnjj22",
        mail = "apasha65@mail.ru",
    )

    userPetr.changeBio()
    println(userPetr.bio)
    println(userPetr.password)
    userPetr.changePass()
    println(userPetr.password)
    userPetr.userData()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {
    fun userData() {
        println(
            """
         $id
         $login
         $password
         $mail
         $bio
    """.trimIndent()
        )
    }

    fun changeBio() {
        println("введи информацию о себе")
        val bioInf = readln()
        bio = bioInf

    }

    fun changePass() {
        println("введите текущий пароль")
        val ininialPass = readln()
        if (ininialPass == password) {
            println("новый пароль:")
            var newPass = readln()
             password = newPass
        }
    }
}
