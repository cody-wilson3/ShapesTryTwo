package org.example

import kotlin.math.sqrt

class Line(
    start: Point,
    end: Point
) {
    var start: Point = start.clonePoint()
        private set
    var end: Point = end.clonePoint()
        private set

    fun getStart(): Point {
        return start.clonePoint()
    }

    fun getEnd(): Point {
        return end.clonePoint()
    }

    // returns number of degrees of the line in Double type
    fun getSlope(): Double {
        val deltaX = end.getX() - start.getX()
        val deltaY = end.getY() - start.getY()

        require(deltaX != 0.0 || deltaY != 0.0) {
            "Slope is undefined for a zero-length line."
        }

        val angleRadians = kotlin.math.atan2(deltaY, deltaX)
        val angleDegrees = Math.toDegrees(angleRadians)
        return angleDegrees
    }

    fun getLength(): Double {
        val dx = end.getX() - start.getX()
        val dy = end.getY() - start.getY()
        return sqrt(dx * dx + dy * dy)
    }

    fun moveLine(deltaX: Double, deltaY: Double) {
        start.move(deltaX, deltaY)
        end.move(deltaX, deltaY)
    }
}