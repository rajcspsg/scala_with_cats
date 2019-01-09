object FunctorSyntaxApp extends App {
    import scala.language.higherKinds
    import cats.Functor
    import cats.instances.function._
    import cats.syntax.functor._

    val func1 = (a: Int) => a + 1
    val func2 = (a: Int) => a * 2
    val func3 = (a: Int) => a + "!"
    val func4 = func1.map(func2).map(func3)

    println(s"func4(123) ${func4(123)}")

    def doMath[F[_]](start: F[Int])(implicit functor: Functor[F]): F[Int] =
                                                    start.map(n => n * 2 + 1 )

    import cats.instances.option._ // for Functor
    import cats.instances.list._ // for Functor
    println(doMath(Option(20)))
    // res3: Option[Int] = Some(22)

    println(doMath(List(1, 2, 3)))
    // res4: List[Int] = List(3, 4, 5)
}