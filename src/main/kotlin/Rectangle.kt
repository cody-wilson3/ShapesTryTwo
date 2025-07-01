package org.example

open class Rectangle(
    corner1: Point,
    corner2: Point
) : Shape() {

    init {
        val width = kotlin.math.abs(corner1.getMyX() - corner2.getMyX())
        val height = kotlin.math.abs(corner1.getMyY() - corner2.getMyY())
        require(width > 0) { "Rectangle cannot have zero width." }
        require(height > 0) { "Rectangle cannot have zero height." }
    }

    private val corner1: Point = corner1
    private val corner2: Point = corner2

    fun getMyCorner1(): Point {
        return corner1.clonePoint()
    }
    fun getMyCorner2(): Point {
        return corner2.clonePoint()
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