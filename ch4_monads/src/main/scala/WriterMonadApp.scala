object WriterMonadApp extends App {
  import cats.data.Writer
  import cats.instances.vector._ // for Monoid
  val writer1: Writer[Vector[String], Int] = Writer(Vector(
           "It was the best of times",
           "it was the worst of times"
         ),
         1859)

    println(writer1.value)
    println(writer1.written)
}
