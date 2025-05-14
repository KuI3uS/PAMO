package com.example.kotlin_exercises

fun pizzaSlicesCounter() {
    var pizzaSlices = 0
    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice(s) of pizza :(")
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray!")
}

fun main() {
    pizzaSlicesCounter()
}