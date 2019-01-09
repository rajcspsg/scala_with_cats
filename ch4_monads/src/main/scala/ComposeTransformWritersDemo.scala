object ComposeTransformWritersDemo extends App {
  import cats.instances.vector._ // for Monoid
  import cats.instances.int._ // for Monoid
  import cats.syntax.applicative._ // for pure
  import cats.data.Writer
  import cats.syntax.writer._
  
  type Logged[A] = Writer[Vector[String], A]
  123.pure[Logged]
  // res2: Logged[Int]

  val writer1: Writer[Vector[String], Int] = for {
    a <- 10.pure[Logged]
    _ <- Vector("a", "b", "c").tell
    b <- 32.writer(Vector("x", "y", "z"))
  } yield a + b

  println(writer1.run)
}
