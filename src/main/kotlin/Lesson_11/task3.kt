package org.example.Lesson_11

fun main() {
    val user1 = User(
        nickName = "lol",
        avatar = "notdefault.png"
    )
    val user2 = User(
        nickName = "peshka",
        avatar = "fish.png"
    )
    val room1 = Room(
        roomName = "laughRoom"

    )
    println(user1.currentStatus)
    println(user2.currentStatus)
    room1.addMember(user1)
    room1.addMember(user2)
    room1.listOfMembers.forEach { println(it.avatar) }
    room1.changeStatus("lol", 1)
    println(user1.currentStatus)

}


class User(
    val nickName: String,
    val avatar: String = "default.png",
    var currentStatus: String = "разговаривает",

    )

class Room(
    val roomName: String,
    val wallPaper: String = "default.png",
    val listOfMembers: MutableList<User> = mutableListOf(),
) {
    fun addMember(user: User) {
        listOfMembers.add(user)
    }

    fun changeStatus(name: String, statusIndex: Int) {
        val member = listOfMembers.find { it.nickName == name } ?: return
        setStatus(member, statusIndex)
        println("статус ${member.nickName}изменен")

    }
}

fun setStatus(user: User, index: Int) {
    var newStatus = when (index) {
        0 -> "разговаривает"
        1 -> "микрофон выключен"
        else -> "заглушен"
    }
    user.currentStatus = newStatus
}



