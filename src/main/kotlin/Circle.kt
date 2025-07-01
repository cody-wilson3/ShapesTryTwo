package org.example

class Circle(
    center: Point,
    radius: Double
){
    var center: Point = center
        private set
    var radius: Double = radius
        private set

    init {
        require(radius > 0) { "Radius must be greater than 0" }
    }

    fun getRadius(): Double {
        return radius
    }

    fun getCenter(): Point {
        return center
    }
}
