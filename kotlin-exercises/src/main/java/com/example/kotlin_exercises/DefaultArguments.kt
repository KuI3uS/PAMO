package com.example.kotlin_exercises

fun greet(name: String = "Stranger") {
    println("Hello, $name!")
}

fun main() {
    greet()
    greet("Jakub")
}