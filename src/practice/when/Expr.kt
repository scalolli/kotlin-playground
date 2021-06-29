package practice.`when`

import practice.`when`.Expr.Sum

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

// These are called Smart casts!
fun eval(expr: Expr): Int =
    when (expr) {
        is Expr.Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
    }


fun main(args: Array<String>) {
    println(eval(Expr.Num(2)))
    println(eval(Sum(Expr.Num(2), Sum(Expr.Num(1), Expr.Num(2)))))
}
