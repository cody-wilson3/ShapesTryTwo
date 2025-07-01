package org.example

class Triangle(
    corner1: Point,
    corner2: Point,
    corner3: Point
) : Shape() {
    var corner1: Point = corner1
        private set
    var corner2: Point = corner2
        private set
    var corner3: Point = corner3
        private set

    fun getCorner1(): Point {
        return corner1
    }
    fun getCorner2(): Point {
        return corner2
    }
    fun getCorner3(): Point {
        return corner3
    }
    override fun move(deltaX: Double, deltaY: Double) {
        corner1.move(deltaX, deltaY)
        corner2.move(deltaX, deltaY)
        corner3.move(deltaX, deltaY)
    }

    override fun area(): Double {
        val x1 = corner1.getX()
        val y1 = corner1.getY()
        val x2 = corner2.getX()
        val y2 = corner2.getY()
        val x3 = corner3.getX()
        val y3 = corner3.getY()

        return 0.5 * kotlin.math.abs(
            x1 * (y2 - y3) +
                    x2 * (y3 - y1) +
                    x3 * (y1 - y2)
        )
    }

}