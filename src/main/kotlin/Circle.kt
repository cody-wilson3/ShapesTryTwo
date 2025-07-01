package org.example

class Circle(
    center: Point,
    radius: Double
) : Ellipse(center, radius, radius){

    init {
        require(radius > 0) { "Radius must be greater than 0" }
    }

    fun getRadius(): Double {
        return radius1
    }

    override fun getCenter(): Point {
        return center
    }
}
