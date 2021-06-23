package practice.`when`

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw IllegalArgumentException("Invalid expression")
    }


fun main(args: Array<String>) {
    println(eval(Num(2)))
    println(eval(Sum(Num(2), Sum(Num(1), Num(2)))))
}
