package com.johnson

fun main() {
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human(name = "johnson" ,height = 1.77f, weight = 75.5f)
    h.hello()
    println(h.bmi())
}

class Human( var height : Float , var weight : Float, var name : String =""){
    init {
        print("Johnson $height $weight")
    }
//    constructor(height: Float,weight: Float,name:String):this(height, weight)
    fun bmi() : Float{
        val bmi = weight/(height*height)
        return bmi
    }

    fun hello(){
        println("Hello Kotlin")
    }
}