package com.example.androidmaster



fun main(){

    showMyName("Yovani")
    showAge(27)
    add(17, 43)
    val result = subtract(50, 45)
    println(result)
    val result2 = subtractCool(27, 10)
    println(result2)

    /*
    // Intereg
    val age:Number = 30
    // Long
    val example:Long = 30
    // Float
    val floatExample:Number = 30.5F
    // Double
    val doubleExample:Number = 336787.7895897

    //Char
    val charExample:Comparable<Char>  = 'e'

    //String
    val stringExamples:Comparable<String> ="Hola Mundo"


    //Booleanas
    val booleanExample:Comparable<Boolean>  = true */

    //println(stringExamples)


}

fun showMyName(name:String){
    println("me llamo $name")

}
fun showAge(age:Int){
    println("Tengo $age años")

}

fun add(number1:Int, number2:Int){
    println(number1+number2)
}
fun subtract(number1:Int, number2:Int):Int {
    return number1 - number2
}

fun subtractCool(number1:Int, number2:Int) = number1 - number2