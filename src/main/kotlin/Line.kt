package org.example

import kotlin.math.sqrt

class Line(
    start: Point,
    end: Point
) {

    init {
        val dx = start.getMyX() - end.getMyX()
        val dy = start.getMyY() - end.getMyY()
        val length = sqrt(dx * dx + dy * dy)

        require(length != 0.0) { "A line cannot have zero length." }
    }

    private val start: Point = start.clonePoint()
    private val end: Point = end.clonePoint()

    fun getMyStart(): Point {
        return start.clonePoint()
    }

    fun getMyEnd(): Point {
        return end.clonePoint()
    }

    // returns number of degrees of the line in Double type
    fun getSlope(): Double {
        val deltaX = end.getMyX() - start.getMyX()
        val deltaY = end.getMyY() - start.getMyY()

        val angleRadians = kotlin.math.atan2(deltaY, deltaX)
        val angleDegrees = Math.toDegrees(angleRadians)
        return angleDegrees
    }

    fun getLength(): Double {
        val dx = end.getMyX() - start.getMyX()
        val dy = end.getMyY() - start.getMyY()
        return sqrt(dx * dx + dy * dy)
    }

    fun moveLine(deltaX: Double, deltaY: Double) {
        start.move(deltaX, deltaY)
        end.move(deltaX, deltaY)
    }
}