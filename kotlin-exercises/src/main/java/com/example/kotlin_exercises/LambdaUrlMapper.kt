package com.example.kotlin_exercises

fun lambdaUrlMapping() {
    val urls = listOf("google", "github", "kotlin")
    val fullUrls = urls.map { "https://www.$it.com" }
    fullUrls.forEach(::println)
}

fun main() {
    lambdaUrlMapping()
}