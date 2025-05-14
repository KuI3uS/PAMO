package com.example.kotlin_exercises

fun rateFeeling(feeling: String): String {
    return when (feeling.lowercase()) {
        "happy" -> "That's great!"
        "sad" -> "Hope things get better."
        else -> "Tell me more!"
    }
}

fun main() {
    println(rateFeeling("happy"))
}