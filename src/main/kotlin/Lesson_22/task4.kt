package org.example.Lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}

class MainScreenViewModel {
    data class MainScreenState(var data: String? = null, val isLoading: Boolean = false)

    var mainScreenState: MainScreenState = MainScreenState()
    fun loadData() {
        mainScreenState = mainScreenState.copy(data = State.NONE.data, isLoading = false)
        println("текущее состояние $mainScreenState")
        Thread.sleep(3000)
        mainScreenState = mainScreenState.copy(data = State.LOAD.data, isLoading = true)
        println("текущее состояние $mainScreenState")
        Thread.sleep(3000)
        mainScreenState = mainScreenState.copy(data = State.ISDATA.data, isLoading = false)
        println("текущее состояние $mainScreenState")
        println("данные загружены")


    }

}

enum class State(val data: String) {
    NONE("- отсутствие данных."),
    LOAD("- загрузка данных."),
    ISDATA("- наличие загруженных данных.")
}

