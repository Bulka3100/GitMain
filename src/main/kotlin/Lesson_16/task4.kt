package org.example.Lesson_16

fun main() {
    val order1 = InternetOrder(1, false)
    order1.showStatus()
    sendRequest(order1, true)
    order1.showStatus()

}

class InternetOrder(
    private val id: Int,
    private var status: Boolean,
) {
    fun changeStatus(newValue: Boolean) {
        status = newValue
    }

    fun showStatus() {
        println(status)
    }
    fun returnId(): Int{
        return id
    }

}

fun sendRequest(order: InternetOrder, newStatus: Boolean) {
    println("Поменяйте пожалуйста статус заказа ${order.returnId()}")
    order.changeStatus(newStatus)

}