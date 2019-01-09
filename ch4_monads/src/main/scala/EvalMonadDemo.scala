object EvalMonadDemo extends App {
    import cats.Eval
    val now = Eval.now(math.random + 1000)
    val later = Eval.later(math.random + 2000)
    val always = Eval.always(math.random + 3000)

    println(now.value)
    println(now.value)

    println(later.value)
    println(later.value)

    println(always.value)
    println(always.value)
}