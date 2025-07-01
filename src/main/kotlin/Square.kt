package org.example

class Square(
    corner1: Point,
    corner2: Point
) : Rectangle(corner1, corner2){

    init {
        val width = kotlin.math.abs(corner1.getMyX() - corner2.getMyX())
        val height = kotlin.math.abs(corner1.getMyY() - corner2.getMyY())
        require(width == height) { "A square must have equal width and height." }
    }
}
