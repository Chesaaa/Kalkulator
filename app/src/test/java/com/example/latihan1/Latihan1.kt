package com.example.latihan1

fun double (a:Int): Int = a*2
fun hi(name:String): Unit = println("Hi $name")

//varargs Parameter
fun abc(name: String, vararg values: Int){
    var total = 0.0
    for (value in values){
        total += value
    }

    total /= values.size.toDouble()
    println("Final Value $name = $total")
}

//extension function
fun String.hello():String{
    return "Hello $this"
}

//infix fun Notation(OOP)
infix fun String.to (type:String):String{
    if (type == "UP"){
        return this.toUpperCase()
    } else{
        return this.toLowerCase()
    }
}

//return if
fun sayHello(name: String=""):String{
    return if(name == ""){
        "Hello Bro"
    } else{
        "Hello $name"
    }
}

fun main() {
    println("Hello, world!!!")
    var A: Int = 10
    var B: Double = 20.5
    var C = A*B
    println(C)

    abc("Abi", 10,20,30,40)

    //function varargs parameter
    val result = double(10)
    hi("supaadhitam")
    println(result)

    val result1 :String= "daffa" to "UP"
    println(result1)
}