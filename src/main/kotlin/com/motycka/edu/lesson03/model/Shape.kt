// Lesson 03 - Shape Interfaces
package com.motycka.edu.lesson03.model

interface Quadrilateral {
    val width: Double
    val length: Double
    fun to3D(depth: Double): Shape3D
}

interface Ellipse {
    val radius: Double
    fun to3D(): Shape3D
}

interface Shape2D {
    fun area(): Double
    fun perimeter(): Double
}

interface Shape3D {
    fun volume(): Double
    fun surfaceArea(): Double
}
