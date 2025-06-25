package com.motycka.edu.lesson02

val coffeeOrders = mutableMapOf<Int, List<String>>()

fun main() {
    processOrder(listOf(ESPRESSO, CAPPUCCINO, CAPPUCCINO, AMERICANO), 20.0)
    processOrder(listOf(ESPRESSO, FLAT_WHITE, AMERICANO), 10.0)
    // processOrder(listOf(ESPRESSO, ESPRESSO, DOUBLE_ESPRESSO), 5.0) // will fail due to insufficient payment
}

fun processOrder(items: List<String>, payment: Double): Double {
    val orderId = placerOrder(items)
    val totalToPay = payOrder(orderId)

    if (payment < totalToPay) {
        println("Insufficient payment. Order cannot be processed.")
        return 0.0
    }

    val change = payment - totalToPay
    completeOrder(orderId)
    println("Order ID: $orderId - Change: $change")
    return change
}

fun placerOrder(items: List<String>): Int {
    val orderId = coffeeOrders.size + 1
    coffeeOrders[orderId] = items
    println("Order ID $orderId has been placed.")
    return orderId
}

fun payOrder(orderId: Int): Double {
    val items = coffeeOrders[orderId]
    var total = 0.0
    items?.forEach { item ->
        total += when (item) {
            ESPRESSO -> ESPRESSO_PRICE
            DOUBLE_ESPRESSO -> DOUBLE_ESPRESSO_PRICE
            CAPPUCCINO -> CAPPUCCINO_PRICE
            LATTE -> LATTE_PRICE
            AMERICANO -> AMERICANO_PRICE
            FLAT_WHITE -> FLAT_WHITE_PRICE
            else -> 0.0
        }
    }
    return total
}

fun completeOrder(orderId: Int) {
    println("Order ID $orderId has been completed.")
}