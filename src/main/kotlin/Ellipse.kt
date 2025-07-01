package org.example

open class Ellipse(
    center: Point,
    radius1: Double,
    radius2: Double
) : Shape() {
    var center: Point = center
        private set
    var radius1: Double = radius1
        private set
    var radius2: Double = radius2
        private set

    fun getCenter(): Point {
        return center
    }
    fun getRadius1(): Double {
        return radius1
    }
    fun getRadius2(): Double {
        return radius2
    }
    override fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }

    override fun area(): Double {
        return kotlin.math.PI * radius1 * radius2
    }
}