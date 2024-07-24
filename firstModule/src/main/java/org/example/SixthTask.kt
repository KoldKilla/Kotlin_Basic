package org.example

fun main(args: Array<String>){
    println("Первое число: ")
    val a = readLine()!!.toInt()

    println("Второе число: ")
    val b = readLine()!!.toInt()

    val finalNum = a>b

    print("Больше ли a, чем b?\n$finalNum")
}