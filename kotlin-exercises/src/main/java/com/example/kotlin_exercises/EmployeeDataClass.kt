package com.example.kotlin_exercises

data class Employee(val name: String, val age: Int)

fun main() {
    val emp = Employee("Jakub", 27)
    println(emp)
}