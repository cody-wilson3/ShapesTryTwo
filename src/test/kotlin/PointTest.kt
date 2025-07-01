package org.example

import kotlin.test.*

class PointTest {

    @Test
    fun pointInitializesCorrectly() {
        val p = Point(3.0, 4.0)

        assertEquals(3.0, p.getMyX())
        assertEquals(4.0, p.getMyY())
    }

    @Test
    fun moveUpdatesCoordinatesCorrectly() {
        val p = Point(1.0, 1.0)
        p.move(2.5, -0.5)

        assertEquals(3.5, p.getMyX(), 0.0001)
        assertEquals(0.5, p.getMyY(), 0.0001)
    }

    @Test
    fun clonePointCreatesDeepCopy() {
        val original = Point(5.0, 6.0)
        val clone = original.clonePoint()

        // Move the clone and ensure original is unaffected
        clone.move(10.0, 10.0)

        assertEquals(5.0, original.getMyX())
        assertEquals(6.0, original.getMyY())

        assertEquals(15.0, clone.getMyX())
        assertEquals(16.0, clone.getMyY())
    }

    @Test
    fun clonedPointHasSameInitialCoordinates() {
        val original = Point(7.0, -3.0)
        val clone = original.clonePoint()

        assertEquals(original.getMyX(), clone.getMyX())
        assertEquals(original.getMyY(), clone.getMyY())
    }
}
