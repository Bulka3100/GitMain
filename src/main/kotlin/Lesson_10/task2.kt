package org.example.Lesson_10

fun main() {
    println("введите логин")
    val login = gettt()

    println("введите пароль")
    val password = gettt()
}

/*fun valid(inputLength: String): Boolean {
    return inputLength.length > 4
}
*/
/*fun getValidInput(): String {
    var input: String
    do {
        input = readln()
        if (!valid(input)) {
            println("Логин или пароль недостаточно длинные. Повторите попытку.")
        }
    } while (!valid(input))
    return input
}*/

fun gettt(): String {
    var login: String
    do {
        login = readln()
        if(login.length<4) println("меньше 4х символов")
    } while (login.length < 4)
    return login
}
