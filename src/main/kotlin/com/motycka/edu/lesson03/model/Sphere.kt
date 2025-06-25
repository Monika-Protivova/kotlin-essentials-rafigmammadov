package com.motycka.edu.lesson03.model

import kotlin.math.PI
import kotlin.math.pow

/*
 Implement Sphere class that implements Shape3D interface.
    - It should have a constructor that takes one parameter for the radius.
    - It should override all methods from Shape3D interface.
 */
class Sphere(val radius: Double) : Shape3D {

    // Implementing the volume method from Shape3D
    override fun volume(): Double = (4.0 / 3.0) * PI * radius.pow(3)

    // Implementing the surfaceArea method from Shape3D
    override fun surfaceArea(): Double = 4 * PI * radius.pow(2)
}
