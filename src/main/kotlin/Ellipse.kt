package org.example

open class Ellipse(
    center: Point,
    radius1: Double,
    radius2: Double
) : Shape() {

    init {
        require( radius1 > 0) { "Radius must be greater than 0" }
        require( radius2 > 0) { "Radius must be greater than 0" }
    }

    private val center: Point = center
    private val radius1: Double = radius1
    private val radius2: Double = radius2

    open fun getCenter(): Point {
        return center.clonePoint()
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