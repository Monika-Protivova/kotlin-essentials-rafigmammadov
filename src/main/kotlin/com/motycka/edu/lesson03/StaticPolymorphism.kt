package com.motycka.edu.lesson03

import kotlin.math.PI

object AreaCalculator {

    // Calculate area of rectangle with Double parameters
    fun calculateRectangleArea(a: Double, b: Double): Double {
        return a * b
    }

    // Calculate area of rectangle with Int parameters
    fun calculateRectangleArea(a: Int, b: Int): Double {
        return a.toDouble() * b.toDouble()
    }

    // Calculate area of circle with Double radius
    fun calculateCircleArea(r: Double): Double {
        return PI * r * r
    }

    // Calculate area of circle with Int radius
    fun calculateCircleArea(r: Int): Double {
        return PI * r * r.toDouble()
    }

    // Calculate area of triangle with Double parameters
    fun calculateTriangleArea(a: Double, b: Double): Double {
        return 0.5 * a * b
    }

    // Calculate area of triangle with Int parameters
    fun calculateTriangleArea(a: Int, b: Int): Double {
        return 0.5 * a * b.toDouble()
    }
}

// Uncomment to test the implementation
fun main() {
    println(AreaCalculator.calculateRectangleArea(5, 10)) // Int version
    println(AreaCalculator.calculateRectangleArea(5.0, 10.0)) // Double version
    println(AreaCalculator.calculateCircleArea(5)) // Int version
    println(AreaCalculator.calculateCircleArea(5.0)) // Double version
    println(AreaCalculator.calculateTriangleArea(5, 10)) // Int version
    println(AreaCalculator.calculateTriangleArea(5.0, 10.0)) // Double version
}
