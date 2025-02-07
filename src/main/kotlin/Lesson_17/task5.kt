package org.example.Lesson_17

fun main() {
    val user = User("Boilix", "strew3901")
    user.login = "Kronos"
    println(user.password)

}


class User(login: String, password: String) {
    var login = login
        get() = field
        set(value) {
            println("логин успешно сменён")
            field = value
        }
    var password = password
        get() = field.map { '*' }.joinToString("")
        set(value) {
            if (value != field)
                println("нельзя изменить пароль")
        }

}
