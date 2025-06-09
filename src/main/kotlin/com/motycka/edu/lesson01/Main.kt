package com.motycka.edu.lesson01

/*
    1. Define the main function with args parameter of type Array<String>
    2. Print "Hello, Kotlin!" to the console
    3. Print the program arguments passed to the main function as: "Program arguments: arg1, arg2, ..."
 */

fun main(args: Array<String>) {
    // Step 1: Print "Hello, Kotlin!" to the console
    println("Hello, Kotlin!")

    // Step 2: Print the program arguments in the specified format
    // If no arguments are provided, this will print an empty list
    println("Program arguments: ${args.joinToString(", ")}")
}
