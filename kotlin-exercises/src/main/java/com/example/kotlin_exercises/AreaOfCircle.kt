package com.example.kotlin_exercises

fun areaOfCircle(radius: Double): Double {
    return Math.PI * radius * radius
}

fun main() {
    println(areaOfCircle(3.0))
}