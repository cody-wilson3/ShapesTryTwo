package org.example

open class Rectangle(
    corner1: Point,
    corner2: Point
) : Shape() {
    var corner1: Point = corner1
        private set
    var corner2: Point = corner2
        private set

    fun getMyCorner1(): Point {
        return corner1
    }
    fun getMyCorner2(): Point {
        return corner2
    }
    override fun move(deltaX: Double, deltaY: Double) {
        corner1.move(deltaX, deltaY)
        corner2.move(deltaX, deltaY)
    }

    override fun area(): Double {
        val width = kotlin.math.abs(corner1.getMyX() - corner2.getMyX())
        val height = kotlin.math.abs(corner1.getMyY() - corner2.getMyY())
        return width * height
    }
}