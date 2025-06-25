package com.motycka.edu.lesson03.model

/*
 Implement Square class that extends the Rectangle class.

    - It should have a constructor that takes one parameter for the side length.
    - It should override all methods from Rectangle class.
    - It should have a method to convert it to a 3D Cuboid with the same side length for width, height, and depth.
 */
class Square(sideLength: Double) : Rectangle(sideLength, sideLength) {

    // Override all methods from Rectangle class (already inherited from Rectangle)
    override fun area(): Double = width * width  // Side length * side length

    override fun perimeter(): Double = 4 * width  // 4 sides of equal length

    // Method to convert the square to a 3D Cuboid with equal width, height, and depth
    fun to3D(): Shape3D = Cuboid(width, width, width)
}
