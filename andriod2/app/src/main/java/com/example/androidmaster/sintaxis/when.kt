package com.example.androidmaster

fun main(){
    resultado("51")

}

fun resultado(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) println("Hola")

    }
}

fun getSemester2(month: Int) = when(month){
    in 1..6-> println("Primer Semestre")
    in 7..12 -> println("Segndo Semestre")
    !in 1..12 -> println("Semestre no valido")
    else -> println("Semestre no valido")
}

fun getSemester(month: Int){
    when(month){
        in 1..6-> println("Primer Semestre")
        in 7..12 -> println("Segndo Semestre")
        !in 1..12 -> println("Semestre no valido")
    }
}

fun getTrimester(month: Int){
    when(month){
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Segndo Trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
        else -> println("Trimestre no valido")
    }
}

fun getMonth(month:Int){
    when(month){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> {
            println("noviembre")
            println("Y mi Cumpleaños")
        }
        12 -> println("diciembre")
        else -> println("mes invalido")
    }
}