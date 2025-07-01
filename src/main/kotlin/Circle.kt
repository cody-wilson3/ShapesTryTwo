package org.example

class Circle(
    centerCircle: Point,
    radius: Double
) : Ellipse(centerCircle, radius, radius){

    init {
        require(radius > 0) { "Radius must be greater than 0" }
    }

    fun getRadius(): Double {
        return getRadius1()
    }
}
