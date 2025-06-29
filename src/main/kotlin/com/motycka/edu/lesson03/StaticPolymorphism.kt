// Lesson 03 - Static Polymorphism
package com.motycka.edu.lesson03

import kotlin.math.PI

object AreaCalculator {
    fun calculateRectangleArea(a: Double, b: Double): Double = a * b
    fun calculateRectangleArea(a: Int, b: Int): Double = a.toDouble() * b.toDouble()
    fun calculateCircleArea(r: Double): Double = PI * r * r
    fun calculateCircleArea(r: Int): Double = PI * r.toDouble() * r.toDouble()
    fun calculateTriangleArea(a: Double, b: Double): Double = 0.5 * a * b
    fun calculateTriangleArea(a: Int, b: Int): Double = 0.5 * a.toDouble() * b.toDouble()
}

fun main() {
    println(AreaCalculator.calculateRectangleArea(5, 10))
    println(AreaCalculator.calculateRectangleArea(5.5, 10.5))
    println(AreaCalculator.calculateCircleArea(7))
    println(AreaCalculator.calculateCircleArea(7.5))
    println(AreaCalculator.calculateTriangleArea(4, 8))
    println(AreaCalculator.calculateTriangleArea(4.5, 8.5))
}
