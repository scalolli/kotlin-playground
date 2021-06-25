package practice

import practice.extensions.lastChar as last

fun main(args: Array<String>) {
    println("Kotlin".last())

    listOf("abc", *args)

    println("12.345-6.A".split('.', '-'))
}