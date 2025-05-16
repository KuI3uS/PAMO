package com.example.kotlin_exercises

fun isInRange(n: Int): Boolean = n in 1..10

fun main() {
    println(isInRange(5))   // true
    println(isInRange(15))  // false
}