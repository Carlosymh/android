package com.example.androidmaster

fun main(){
    ifMultiple()

}

fun ifBasic(){
    val name = "Carlos"

    if(name.lowercase() == "carlos"){
        return println("tu nombre es carlos")
    }
    println("tu nombre no es carlos")
}

fun ifAnidados(){
    val animal ="dog"
    if(animal == "dog"){
        println("es un perro")
    }else if(animal == "cat"){
        println("es un gato")
    }else if(animal == "bird"){
        println("es un pajaro")
    }else {
        println("No es uno de los animales esperados ")
    }
}

fun ifBoolean(){
    var soyFeliz = true

    if(soyFeliz){
        println("Soy feliz")
    }
}

fun ifInt(){
    var age = 25

    if(age >= 18){
        println("Beber Cerveza")
    }else{
        println("Beber un Jugo")
    }
}

fun ifMultiple(){
    var age = 25
    var permissionParent = false
    var haveMoney = true

    if(age>=18 && permissionParent && haveMoney){
        println("Puedes beber Cerveza")
    }else{
        println("No puedes beber cerveza")
    }

}


fun ifMultipleOr(){
    var age = 25
    var permissionParent = false
    var haveMoney = true

    if(age>=18 || (permissionParent && haveMoney)){
        println("Puedes beber Cerveza")
    }else{
        println("No puedes beber cerveza")
    }

}