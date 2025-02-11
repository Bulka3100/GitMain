package org.example.Lesson_16

fun main() {
    val order1 = InternetOrder(1, false)
    order1.showStatus()
    order1.sendRequest(true)
    order1.showStatus()

}

class InternetOrder(
    private val id: Int,
    private var status: Boolean,
) {
    private fun changeStatus(newValue: Boolean) {
        status = newValue
    }

    fun showStatus() {
        println(status)
    }
    fun returnId(): Int{
        return id
    }
fun sendRequest(newStatus: Boolean){
    changeStatus(newStatus)
}
}



