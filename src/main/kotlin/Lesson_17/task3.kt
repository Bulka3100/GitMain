package org.example.Lesson_17

fun main() {
    val folder = Folder("Работа", 3, true)
    println(folder.name)
    println(folder.numberOfFiles)
}

class Folder(name: String, numberOfFiles: Int, flag: Boolean) {
    val name = name
        get() = if (flag == true) "скрытая папка" else field
    val numberOfFiles: Int = numberOfFiles
        get() = if (flag == true) 0 else field
    val flag: Boolean = flag
}