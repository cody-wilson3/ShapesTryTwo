package org.example

class Point(
    x: Double,
    y: Double
){
    private var x: Double = x
    private var y: Double = y

    fun getMyX(): Double = x
    fun getMyY(): Double = y
    fun clonePoint(): Point {
        return Point(x, y)
    }
    fun move(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
    }
}