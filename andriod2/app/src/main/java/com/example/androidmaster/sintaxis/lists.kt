package com.example.androidmaster

fun main() {
    mutableList()

}
fun mutableList(){
    val weeksDays:MutableList<String> = mutableListOf("Lunes","martes")
    weeksDays.add(0,"Miercoles")
    print(weeksDays)
    if(weeksDays.isEmpty()){
        println("La lista esta vacia")
    }
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes", "Sabado","Domingo")
    println(readOnly.size)
    println(readOnly.first())
    println(readOnly.last())
    println(readOnly[0])

    var example = readOnly.filter { it.contains("a")}

    println(example)

    readOnly.forEach { element ->println(element)}
}