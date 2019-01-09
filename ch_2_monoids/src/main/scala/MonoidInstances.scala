object MonoidInstances extends App {

  import cats.Monoid

  val result = Monoid[Int](new Monoid[Int] {
    override def combine(x: Int, y: Int): Int = x * y

    override def empty: Int = 1
  }).combine(32, 10)

  println(result)

  def add(items: List[Int]): Int = {
    import cats.instances.int._
    Monoid[Int].combineAll(items)
  }

  println(add(List(4,6,9)))

}
