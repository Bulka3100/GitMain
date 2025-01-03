package org.example.Lesson_15

fun main() {
    val regularUser = RegularUser("Dopper")
    regularUser.readForum()
    val administrator = Administrator("MODERATOR")
    administrator.banUser(regularUser)
}

abstract class User(
    val userName: String,
    val administrationRights: Boolean,
) {
    fun readForum() {
        println("статья открыта")
    }

    fun comment() {
        println("сообщение оставлено")
    }
}

class RegularUser(
    userName: String,
    administrationRights: Boolean = false
) : User(userName, administrationRights)

class Administrator(
    userName: String,
    administrationRights: Boolean = true
) : User(userName, administrationRights) {
    fun banUser(user: RegularUser) {
        println("пользователь ${user.userName} заблокирован")
    }

    fun deleteComment() {
println("сообщение удалено")
    }
}