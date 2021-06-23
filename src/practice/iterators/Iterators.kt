package practice.iterators

fun main() {
    val range = 1..10

    for (i in range)
        print(fizzBuzz(i))

    range.map { print(it) }
}

fun fizzBuzz(i: Int) =
    when {
        i % 15 == 0 -> "FizzBuzz"
        i % 3 == 0 -> "Fizz "
        i % 5 == 0 -> "Buzz "
        else -> "$i "
    }