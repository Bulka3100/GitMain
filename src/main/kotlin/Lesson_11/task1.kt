package org.example.Lesson_11

fun main() {
    val user1: UserData = UserData(
        id = 1,
        login = "antoha",
        password = "sksf332e",
        mail = "AnonAnton89@mail.ru"
    )
    val user2: UserData = UserData(
        id = 2,
        login = "paavelItel",
        password = "rfrfrf33",
        mail = "pashka21@mail.ru"
    )
    println(
        """
         ${user1.id}
         ${user1.login}
         ${user1.password}
         ${user1.mail}
         ${user2.id}
         ${user2.login}
         ${user2.password}
         ${user2.mail}
          
    """.trimIndent()
    )
}

class UserData(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String

)
