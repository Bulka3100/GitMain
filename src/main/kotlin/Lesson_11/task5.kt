package org.example.Lesson_11

fun main() {
    val forum = Forum()
    forum.createNewUser("Albert")
    forum.createNewUser("John")
    println(forum.memberList)
    forum.createNewMessage(1, "hi")
    forum.createNewMessage(2, "what's up?")
    forum.printThread()

}

class Forum(
    val memberList: MutableList<ForumUser> = mutableListOf<ForumUser>(),
    val messageList: MutableList<ForumMessage> = mutableListOf<ForumMessage>(),
) {
    fun createNewUser(userName: String): ForumUser {
        id++
        val newUser = ForumUser(id, userName)
        return newUser.also { newUser -> memberList.add(newUser) }
    }

    fun createNewMessage(id: Int, message: String): ForumMessage? {
        if (id in memberList.map { it.userId }) {
            val newMessage = ForumMessage(id, message)
            messageList.add(newMessage)
            return newMessage

        } else return null
    }

    fun printThread() {
        messageList.forEach { message ->
            val name = memberList.find { it.userId == message.authorId }
            println(name?.let {
                ("${name?.userName}:${message.message}")
            } ?: "пользователь не найден")

        }

    }

    companion object {
        var id = 0
    }
}

data class ForumUser(
    val userId: Int,
    val userName: String,
)

data class ForumMessage(
    val authorId: Int,
    val message: String
)


