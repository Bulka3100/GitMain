package org.example.Lesson_5

fun main() {
    println("Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. Я всегда готов служить, хотя это не приносит мне радости... ")
    val logUser = readLine()
    if (logUser == REGISTERED_USER_NAME) {
    } else {
        println("хотите зарегистрироваться?")
        return
    }
    println("введите пароль пользователя ")
    val logPassword = readLine()
    if (logPassword == REGISTERED_USER_PASSWORD) println("[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь $REGISTERED_USER_NAME, вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... ")
}

const val REGISTERED_USER_NAME = "Zaphod"
const val REGISTERED_USER_PASSWORD = "PanGalactic"