object StateMonadDemo extends App {

  import cats.data.State
  val a = State[Int, String] { state =>
    (state, s"The state is $state")
  }

  val step1 = State[Int, String] { num =>
    val ans = num + 1
    (ans, s"Result of step1: $ans")
  }
// step1: cats.data.State[Int,String] = cats.data.

  val step2 = State[Int, String] { num =>
    val ans = num * 2
    (ans, s"Result of step2: $ans")
  }

  val both = for {
    a <- step1
    b <- step2
  } yield (a, b)

    val (state, result) = both.run(20).value
    println(s"state $state result $result")
}
