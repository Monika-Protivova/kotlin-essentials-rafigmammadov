package com.motycka.edu.lesson03.model

import kotlin.math.PI

/*
 Implement Circle class that implements Shape2D and Ellipse interfaces.

    - It should have a constructor that takes one parameter for the radius.
    - It should override all methods from Shape2D and Ellipse interfaces.
 */

class Circle(override val radius: Double) : Shape2D, Ellipse {

    // Implementing the area method from Shape2D
    override fun area(): Double = PI * radius.pow(2)

    // Implementing the perimeter method from Shape2D
    override fun perimeter(): Double = 2 * PI * radius

    // Implementing the to3D method from Ellipse
    override fun to3D(): Shape3D = Sphere(radius)  // For 3D, we use a sphere

}