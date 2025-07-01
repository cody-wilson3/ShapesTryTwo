package org.example

import kotlin.test.*

class CircleTest {

    @Test
    fun createsCircleWithValidRadius() {
        val center = Point(0.0, 0.0)
        val circle = Circle(center, 5.0)

        assertEquals(5.0, circle.getRadius(), "Radius should be 5.0")
        assertEquals(0.0, circle.getCenter().getMyX())
        assertEquals(0.0, circle.getCenter().getMyY())
    }

    @Test
    fun throwsExceptionWhenRadiusIsZero() {
        val center = Point(1.0, 1.0)

        val exception = assertFailsWith<IllegalArgumentException> {
            Circle(center, 0.0)
        }

        assertEquals("Radius must be greater than 0", exception.message)
    }

    @Test
    fun getRadiusReturnsCorrectValue() {
        val circle = Circle(Point(1.0, 2.0), 3.0)
        assertEquals(3.0, circle.getRadius())
    }

    @Test
    fun centerIsDefensivelyCopied() {
        val center = Point(5.0, 6.0)
        val circle = Circle(center, 4.0)

        val copy = circle.getCenter()
        copy.move(100.0, 100.0)

        assertEquals(5.0, circle.getCenter().getMyX())
        assertEquals(6.0, circle.getCenter().getMyY())
    }
}
