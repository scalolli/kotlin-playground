package practice

fun main(args: Array<String>) {
    data class Person(val name: String, val age: Int? = null)

    val persons = listOf(Person("Alice"), Person("Bob", age = 29))
    val oldest = persons.maxByOrNull { it.age ?: 0 }

    println("Oldest person is: $oldest")
}

fun max(a: Int, b: Int) = if (a > b) b else a

class Rectangle(val height: Int, val width: Int) {
    val isSquare
        get() = height == width
}
