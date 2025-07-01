package org.example

class Point(
    x: Double,
    y: Double
){
    var x: Double = x
        private set
    var y: Double = y
        private set

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