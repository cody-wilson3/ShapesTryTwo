package org.example

import kotlin.test.*

class EllipseTest {

    @Test
    fun createsEllipseWithValidRadii() {
        val center = Point(1.0, 2.0)
        val ellipse = Ellipse(center, 3.0, 4.0)

        assertEquals(3.0, ellipse.getRadius1())
        assertEquals(4.0, ellipse.getRadius2())
        assertEquals(1.0, ellipse.getCenter().getMyX())
        assertEquals(2.0, ellipse.getCenter().getMyY())
    }

    @Test
    fun throwsExceptionWhenRadius1IsZero() {
        val center = Point(0.0, 0.0)

        val exception = assertFailsWith<IllegalArgumentException> {
            Ellipse(center, 0.0, 2.0)
        }

        assertEquals("Radius must be greater than 0", exception.message)
    }

    @Test
    fun throwsExceptionWhenRadius2IsZero() {
        val center = Point(0.0, 0.0)

        val exception = assertFailsWith<IllegalArgumentException> {
            Ellipse(center, 2.0, 0.0)
        }

        assertEquals("Radius must be greater than 0", exception.message)
    }

    @Test
    fun computesCorrectArea() {
        val ellipse = Ellipse(Point(0.0, 0.0), 3.0, 2.0)
        val expected = kotlin.math.PI * 3.0 * 2.0
        assertEquals(expected, ellipse.area())
    }

    @Test
    fun moveShiftsCenterCorrectly() {
        val ellipse = Ellipse(Point(5.0, 5.0), 3.0, 2.0)
        ellipse.move(2.0, -3.0)

        val movedCenter = ellipse.getCenter()
        assertEquals(7.0, movedCenter.getMyX())
        assertEquals(2.0, movedCenter.getMyY())
    }
}
