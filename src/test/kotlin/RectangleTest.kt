package org.example

import kotlin.test.*

class RectangleTest {

    @Test
    fun createsRectangleAndCalculatesAreaCorrectly() {
        val p1 = Point(1.0, 1.0)
        val p2 = Point(4.0, 5.0)
        val rectangle = Rectangle(p1, p2)

        val expectedArea = 3.0 * 4.0 // width * height
        assertEquals(expectedArea, rectangle.area())
    }

    @Test
    fun getMyCorner1ReturnsCopyNotReference() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(2.0, 2.0)
        val rectangle = Rectangle(p1, p2)

        val corner = rectangle.getMyCorner1()
        corner.move(100.0, 100.0)

        // Internal corner1 should not be affected
        assertEquals(0.0, rectangle.getMyCorner1().getMyX())
        assertEquals(0.0, rectangle.getMyCorner1().getMyY())
    }

    @Test
    fun moveChangesBothCornersCorrectly() {
        val p1 = Point(1.0, 1.0)
        val p2 = Point(3.0, 4.0)
        val rectangle = Rectangle(p1, p2)

        rectangle.move(2.0, 3.0)

        val movedCorner1 = rectangle.getMyCorner1()
        val movedCorner2 = rectangle.getMyCorner2()

        assertEquals(3.0, movedCorner1.getMyX())
        assertEquals(4.0, movedCorner1.getMyY())
        assertEquals(5.0, movedCorner2.getMyX())
        assertEquals(7.0, movedCorner2.getMyY())
    }

    @Test
    fun throwsExceptionWhenWidthIsZero() {
        val p1 = Point(2.0, 1.0)
        val p2 = Point(2.0, 5.0) // same x → width = 0

        val exception = assertFailsWith<IllegalArgumentException> {
            Rectangle(p1, p2)
        }

        assertEquals("Rectangle cannot have zero width.", exception.message)
    }

    @Test
    fun throwsExceptionWhenHeightIsZero() {
        val p1 = Point(1.0, 3.0)
        val p2 = Point(4.0, 3.0) // same y → height = 0

        val exception = assertFailsWith<IllegalArgumentException> {
            Rectangle(p1, p2)
        }

        assertEquals("Rectangle cannot have zero height.", exception.message)
    }
}

