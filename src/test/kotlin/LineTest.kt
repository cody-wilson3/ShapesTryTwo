package org.example

import kotlin.test.*
import kotlin.math.sqrt

class LineTest {

    @Test
    fun createsLineAndCalculatesLengthCorrectly() {
        val start = Point(0.0, 0.0)
        val end = Point(3.0, 4.0)
        val line = Line(start, end)

        val expectedLength = 5.0 // 3-4-5 triangle
        assertEquals(expectedLength, line.getLength(), 0.0001)
    }

    @Test
    fun calculatesCorrectSlopeInDegrees() {
        val line = Line(Point(0.0, 0.0), Point(1.0, 1.0))
        val slope = line.getSlope()

        assertEquals(45.0, slope, 0.0001)
    }

    @Test
    fun slopeForVerticalLineIs90Degrees() {
        val line = Line(Point(0.0, 0.0), Point(0.0, 5.0))
        val slope = line.getSlope()

        assertEquals(90.0, slope, 0.0001)
    }

    @Test
    fun slopeForHorizontalLineIs0Degrees() {
        val line = Line(Point(0.0, 2.0), Point(4.0, 2.0))
        val slope = line.getSlope()

        assertEquals(0.0, slope, 0.0001)
    }

    @Test
    fun throwsExceptionForZeroLengthLine() {
        val point = Point(2.0, 2.0)

        val exception = assertFailsWith<IllegalArgumentException> {
            Line(point, point).getSlope()
        }

        assertEquals("A line cannot have zero length.", exception.message)
    }

    @Test
    fun moveLineShiftsBothPointsCorrectly() {
        val line = Line(Point(1.0, 2.0), Point(3.0, 4.0))
        line.moveLine(2.0, -1.0)

        val newStart = line.getMyStart()
        val newEnd = line.getMyEnd()

        assertEquals(3.0, newStart.getMyX())
        assertEquals(1.0, newStart.getMyY())
        assertEquals(5.0, newEnd.getMyX())
        assertEquals(3.0, newEnd.getMyY())
    }

    @Test
    fun getMyStartAndEndAreClones() {
        val originalStart = Point(1.0, 1.0)
        val originalEnd = Point(4.0, 5.0)
        val line = Line(originalStart, originalEnd)

        val externalStart = line.getMyStart()
        externalStart.move(100.0, 100.0)

        assertEquals(1.0, line.getMyStart().getMyX())
        assertEquals(1.0, line.getMyStart().getMyY())
    }
}
