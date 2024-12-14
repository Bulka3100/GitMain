package org.example.Lesson_11

fun main(){
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
    println(room1.listOfMembers)
    room1.changeStatus(user1,1)
    println(user1.currentStatus)

}


class User(
    val nickName: String,
    val statusForms: List<String> = listOf<String>("разговаривает","микрофон выключен","пользователь заглушен"),
    val avatar: String="default.png",
    var currentStatus: String = "разговаривает",

    )
class Room(
    val roomName: String,
    val wallPaper:String = "default.png",
    val listOfMembers: MutableList<User> = mutableListOf(),
){
    fun addMember(user: User){
        listOfMembers.add(user)
    }
    fun changeStatus(user: User, statusIndex: Int){
        user.currentStatus = user.statusForms[statusIndex]
        println("статус ${user.nickName} обнавлён на ${user.statusForms[statusIndex]}")

    }
}


