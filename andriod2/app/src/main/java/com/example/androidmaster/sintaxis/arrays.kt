package com.example.androidmaster

fun main(){
    var name:String = "Yovani"
    var weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(name)
    if(weekDays.size>=8){
        println(println(weekDays[7]))
    }

    weekDays.forEach { println(it) }

    for (position in weekDays.indices){
        println(position)

    }

    for (day in weekDays){
        println(day)

    }

    for ((position, day) in weekDays.withIndex()){
        println("La $position tiene el valor $day")

    }

}