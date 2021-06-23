package practice.greeting

import practice.greeting.Color.BLUE
import practice.greeting.Color.RED
import practice.max

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255)
}

fun main(args: Array<String>) {
    println("Max value is ${max(1, 2)}")
    val color = Color.GREEN

    val phrase = when (color) {
        RED, BLUE -> "Richard"
        else -> "No color!"
    }

    println(phrase)
}