package org.example

abstract class Shape {
    abstract fun move(deltaX: Double, deltaY: Double)
    abstract fun area(): Double
}