package org.example.Lesson_22

fun main() {

}
class MainScreenViewModel(
    val mainScreenState: MainScreenState
) {
    init {
        if(mainScreenState.isLoading==true)
    }
    data class MainScreenState(
        var data: String,
        var isLoading: Boolean = false
    )
    fun loadData(){
mainScreenState.data =noneData
    }
    companion object{
        val noneData="- отсутствие данных;"
        val loadData="- загрузка данных;"
        val isData= "- наличие загруженных данных."
    }
}
//TODO понять логику