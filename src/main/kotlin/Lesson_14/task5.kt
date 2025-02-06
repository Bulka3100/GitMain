package org.example.Lesson_14

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val greetingChat = Chat()
    greetingChat.addMessage("Hi", "Daniel")
    greetingChat.addThreadMessage(greetingChat.messageList.last().id, "Sara", "How are you?") //подсмотрел что так можно сам не понял как
    greetingChat.printChat()
    println(greetingChat.messageList.last().id)
    greetingChat.addMessage("Hiee", "Hopper")
}

open class Chat(
    val messageList: MutableList<Message> = mutableListOf<Message>(),
) {
    fun addMessage(text: String, userName: String) {
        val newMessage = Message(id = generateId(), text, userName)
        println("от пользователя $userName: $text")
        messageList.add(newMessage)
    }

    fun addThreadMessage(parentid: Int, userName: String, text: String) {
        val newThreadMessage =ChildMessage(parentid, id=generateId(), text, userName)
        println("создана ветка для обсуждения")
        messageList.add(newThreadMessage)
    }

    fun generateId(): Int {
        return Random.nextInt(1..100)
    }
    fun printChat() {
        messageList.forEach { println(it) }
    }

}

open class Message(
    val id: Int,
    val text: String,
    val userName: String,
) {
    override fun toString(): String {
        return "[$id] $userName: $text"
    }
}

class ChildMessage(
    val parentid: Int,
    id: Int,
    text: String,
    userName: String
) : Message(id, text, userName){
    override fun toString(): String {
        return "\t[${this.id}] ${this.userName}: ${this.text}"
    }}

