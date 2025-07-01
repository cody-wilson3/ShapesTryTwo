package org.example

import kotlin.test.*

class SquareTest {

    @Test
    fun createsValidSquare() {
        val p1 = Point(1.0, 1.0)
        val p2 = Point(4.0, 4.0)

        val square = Square(p1, p2)

        val expectedArea = 9.0 // 3 x 3
        assertEquals(expectedArea, square.area())
    }

    @Test
    fun throwsExceptionWhenWidthAndHeightAreNotEqual_widthGreater() {
        val p1 = Point(1.0, 1.0)
        val p2 = Point(5.0, 3.0) // width = 4, height = 2

        val exception = assertFailsWith<IllegalArgumentException> {
            Square(p1, p2)
        }

        assertEquals("A square must have equal width and height.", exception.message)
    }

    @Test
    fun throwsExceptionWhenWidthAndHeightAreNotEqual_heightGreater() {
        val p1 = Point(2.0, 2.0)
        val p2 = Point(4.0, 7.0) // width = 2, height = 5

        val exception = assertFailsWith<IllegalArgumentException> {
            Square(p1, p2)
        }

        assertEquals("A square must have equal width and height.", exception.message)
    }

    @Test
    fun throwsExceptionWhenWidthAndHeightAreZero() {
        val p1 = Point(1.0, 1.0)
        val p2 = Point(1.0, 1.0) // zero width and height

        val exception = assertFailsWith<IllegalArgumentException> {
            Square(p1, p2)
        }

        assertEquals("Rectangle cannot have zero width.", exception.message)
    }
}
