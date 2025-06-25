package com.motycka.edu.lesson03.model

/*
 Implement Rectangle class that implements Shape2D and Quadrilateral interfaces.
    - It should have a constructor that takes two parameters for width and length.
    - It should override all methods from Shape2D and Quadrilateral interfaces.
 */
class Rectangle(override val width: Double, override val length: Double) : Shape2D, Quadrilateral {

    // Implementing the area method from Shape2D
    override fun area(): Double = width * length

    // Implementing the perimeter method from Shape2D
    override fun perimeter(): Double = 2 * (width + length)

    // Implementing the to3D method from Quadrilateral
    override fun to3D(depth: Double): Shape3D = Cuboid(width, length, depth)  // Converts to 3D cuboid
}
