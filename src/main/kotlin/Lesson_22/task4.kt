package org.example.Lesson_22

fun main() {

}

class MainScreenViewModel(
    val mainScreenState: MainScreenState
) {
     class MainScreenState(data: String,isLoading: Boolean){
        val data: String = data
            set(value){
                field=value
            }
        var isLoading: Boolean = isLoading
    }



    fun loadData(state: State) {
        when(state){

    }}


    data class State(
        val noneData: String = "- отсутствие данных",
        val loadData: String = "- загрузка данных;",
        val isData: String = "- наличие загруженных данных.",
    )

    }

