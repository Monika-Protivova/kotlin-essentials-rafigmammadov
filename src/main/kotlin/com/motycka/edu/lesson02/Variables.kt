package com.motycka.edu.lesson02

// Define String constants for the two types of coffee
const val espresso = "Espresso"
const val cappuccino = "Cappuccino"

// Define Double constants for the prices of espresso and cappuccino
const val espressoPrice = 2.5
const val cappuccinoPrice = 3.0

fun variables(espressoQuantity: Int, cappuccinoQuantity: Int) {
    // Calculate the total price based on the quantities and prices
    val totalPrice = (espressoPrice * espressoQuantity) + (cappuccinoPrice * cappuccinoQuantity)

    // Print the total price
    println(totalPrice)
}

fun main(args: Array<String>) {
    // Count how many espressos and cappuccinos were ordered
    val espressoQuantity = args.count { it == espresso }
    val cappuccinoQuantity = args.count { it == cappuccino }

    // Call the variables function to calculate and print the total price
    variables(espressoQuantity = espressoQuantity, cappuccinoQuantity = cappuccinoQuantity)
}
