package org.example

class Square(
    corner1: Point,
    corner2: Point
) : Rectangle(corner1, corner2){

    init {
        val width = kotlin.math.abs(corner1.getX() - corner2.getX())
        val height = kotlin.math.abs(corner1.getY() - corner2.getY())
        require(width == height) { "A square must have equal width and height." }
    }
}
