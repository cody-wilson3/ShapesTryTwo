package org.example

class Triangle(
    corner1: Point,
    corner2: Point,
    corner3: Point
) : Shape() {

    // area calculation logic moved inside here since data members aren't initialized yet
    // so calling area() crashes
    init {
        val x1 = corner1.getMyX()
        val y1 = corner1.getMyY()
        val x2 = corner2.getMyX()
        val y2 = corner2.getMyY()
        val x3 = corner3.getMyX()
        val y3 = corner3.getMyY()

        val area = 0.5 * kotlin.math.abs(
            x1 * (y2 - y3) +
                    x2 * (y3 - y1) +
                    x3 * (y1 - y2)
        )

        require(area > 0.0) {
            "Area must be greater than zero"
        }
    }
    private val corner1: Point = corner1
    private val corner2: Point = corner2
    private val corner3: Point = corner3

    fun getMyCorner1(): Point {
        return corner1.clonePoint()
    }
    fun getMyCorner2(): Point {
        return corner2.clonePoint()
    }
    fun getMyCorner3(): Point {
        return corner3.clonePoint()
    }
    override fun move(deltaX: Double, deltaY: Double) {
        corner1.move(deltaX, deltaY)
        corner2.move(deltaX, deltaY)
        corner3.move(deltaX, deltaY)
    }

    override fun area(): Double {
        val x1 = corner1.getMyX()
        val y1 = corner1.getMyY()
        val x2 = corner2.getMyX()
        val y2 = corner2.getMyY()
        val x3 = corner3.getMyX()
        val y3 = corner3.getMyY()

        return 0.5 * kotlin.math.abs(
            x1 * (y2 - y3) +
                    x2 * (y3 - y1) +
                    x3 * (y1 - y2)
        )
    }

}