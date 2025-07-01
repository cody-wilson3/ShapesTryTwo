package org.example

import kotlin.test.*

class TriangleTest {

    @Test
    fun createsValidTriangleAndComputesAreaCorrectly() {
        val t = Triangle(
            Point(0.0, 0.0),
            Point(4.0, 0.0),
            Point(0.0, 3.0)
        )

        val expectedArea = 0.5 * 4.0 * 3.0 // base * height / 2
        assertEquals(expectedArea, t.area(), 0.0001)
    }

    @Test
    fun throwsExceptionWhenAreaIsZero() {
        val p1 = Point(1.0, 1.0)
        val p2 = Point(2.0, 2.0)
        val p3 = Point(3.0, 3.0) // colinear with p1 and p2

        val exception = assertFailsWith<IllegalArgumentException> {
            Triangle(p1, p2, p3)
        }

        assertEquals("Area must be greater than zero", exception.message)
    }

    @Test
    fun moveShiftsAllPointsCorrectly() {
        val triangle = Triangle(
            Point(0.0, 0.0),
            Point(3.0, 0.0),
            Point(0.0, 4.0)
        )

        triangle.move(1.0, 2.0)

        val c1 = triangle.getMyCorner1()
        val c2 = triangle.getMyCorner2()
        val c3 = triangle.getMyCorner3()

        assertEquals(1.0, c1.getMyX())
        assertEquals(2.0, c1.getMyY())
        assertEquals(4.0, c2.getMyX())
        assertEquals(2.0, c2.getMyY())
        assertEquals(1.0, c3.getMyX())
        assertEquals(6.0, c3.getMyY())
    }

    @Test
    fun getMyCornersReturnClones() {
        val triangle = Triangle(
            Point(1.0, 1.0),
            Point(4.0, 1.0),
            Point(1.0, 5.0)
        )

        val corner = triangle.getMyCorner1()
        corner.move(10.0, 10.0)

        // Original corner should remain unchanged
        val originalCorner = triangle.getMyCorner1()
        assertEquals(1.0, originalCorner.getMyX())
        assertEquals(1.0, originalCorner.getMyY())
    }
}
