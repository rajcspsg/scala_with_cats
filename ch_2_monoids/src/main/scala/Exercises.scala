object Exercises extends App {

  import cats.Monoid
  import cats.instances.string._ // for Monoid
  import cats.syntax.semigroup._// for |+|
  import cats.instances.int._ // for Monoid
  import cats.instances.option._ // for Monoid
  import cats.instances.map._

  println("Scala" |+| " with " |+| "Cats")

  println(Option(1) |+| Option(2))

  val map1 = Map("a" -> 1, "b" -> 2)
  val map2 = Map("b" -> 3, "d" -> 4)

  println(map1 |+| map2)

  import cats.instances.tuple._
  val tuple1 = ("hello", 123)
  val tuple2 = ("world", 321)

  println(tuple1 |+| tuple2)

}
