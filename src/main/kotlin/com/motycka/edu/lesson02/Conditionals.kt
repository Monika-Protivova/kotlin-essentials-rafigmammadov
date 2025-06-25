package com.motycka.edu.lesson02


const val ESPRESSO_PRICE = 2.5
const val DOUBLE_ESPRESSO_PRICE = 3.0
const val CAPPUCCINO_PRICE = 3.0
const val LATTE_PRICE = 3.5
const val AMERICANO_PRICE = 2.0
const val FLAT_WHITE_PRICE = 3.2

/*
    1. Get price bas on item names
    2. Get the lowest price from a list of prices
    3. Calculate a total price for a list of items
    4. Calculate a discount if 3 or more items are ordered (the cheapest item is free)
    5. Print the total price with a discount applied for each order
 */
fun conditionals() {
    val coffeeOrders = mapOf(
        1 to listOf(ESPRESSO, CAPPUCCINO, LATTE, AMERICANO),
        2 to listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)
    )

    coffeeOrders.forEach { orderId, items ->

        println("Processing Order ID: $orderId")
        println("Items: $items")

        // 1. Get price based on item names
        var totalPrice = 0.0
        items.forEach { item ->
            totalPrice += when (item) {
                ESPRESSO -> ESPRESSO_PRICE
                DOUBLE_ESPRESSO -> DOUBLE_ESPRESSO_PRICE
                CAPPUCCINO -> CAPPUCCINO_PRICE
                LATTE -> LATTE_PRICE
                AMERICANO -> AMERICANO_PRICE
                FLAT_WHITE -> FLAT_WHITE_PRICE
                else -> 0.0
            }
        }

        // 2. Get the lowest price from a list of prices
        val prices = items.map {
            when (it) {
                ESPRESSO -> ESPRESSO_PRICE
                DOUBLE_ESPRESSO -> DOUBLE_ESPRESSO_PRICE
                CAPPUCCINO -> CAPPUCCINO_PRICE
                LATTE -> LATTE_PRICE
                AMERICANO -> AMERICANO_PRICE
                FLAT_WHITE -> FLAT_WHITE_PRICE
                else -> 0.0
            }
        }
        val lowestPrice = prices.minOrNull() ?: 0.0

        // 3. Calculate total price for a list of items (already done in totalPrice)
        
        // 4. Calculate a discount if 3 or more items are ordered (the cheapest item is free)
        if (items.size >= 3) {
            totalPrice -= lowestPrice
        }

        // 5. Print the total price with a discount applied for each order
        println("Total price for Order ID $orderId: $totalPrice\n")
    }
}

fun main() {
    conditionals()
}
