package practice.classes

data class Person(val name: String, val age: Int? = null) {
    companion object {
    }
}

fun Person.Companion.fromJson(json: String) {
    Person("blah", 123)
}

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"), Person("Bob", age = 29))
    val oldest = persons.maxByOrNull { it.age ?: 0 }

    println("Oldest person is: $oldest")

    val client = Client("ABC Corp", 123)
    client.copy(name = "Basu!")

    Client.withName("Name")

    println(Person.fromJson("{}"))
}

fun max(a: Int, b: Int) = if (a > b) b else a

class Rectangle(val height: Int, val width: Int) {
    val isSquare
        get() = height == width
}

interface Clickable {
    fun click()
}

open class Button : Clickable {
    override fun click() {
        println("Clicked!")
    }
}

open class RichButton : Clickable {
    fun disable() {}

    open fun animate() {}

    final override fun click() {
        TODO("Not yet implemented")
    }
}

class RadioButton : Button()

abstract class Animated {
    abstract fun animate()
}


class User constructor(_nickname: String) {
    val nickname: String = _nickname
}

data class Client(val name: String, val postalCode: Int) {
    companion object {
        fun withName(name: String) = Client(name, 411015)
    }
}
