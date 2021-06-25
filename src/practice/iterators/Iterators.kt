package practice.iterators

fun main() {
    val range = 1..10

    for (i in range)
        print(fizzBuzz(i))

    for (i in 100 downTo 1 step 2)
        println(i)

    range.map { print(it) }

    val map = mapOf("1" to 1, "2" to 2, "3" to 3)

    for ((k, v) in map)
        println("Key is $k -> $v")

    val list = listOf(1, 2, 3)
    list.forEach(::println)
}

fun fizzBuzz(i: Int) =
    when {
        i % 15 == 0 -> "FizzBuzz"
        i % 3 == 0 -> "Fizz "
        i % 5 == 0 -> "Buzz "
        else -> "$i "
    }