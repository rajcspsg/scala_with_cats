object MonadSyntaxApp extends App {
  import cats.instances.option._ // for Monad
  import cats.instances.list._ // for Monad
  import cats.syntax.applicative._

  println(1.pure[Option])
// res4: Option[Int] = Some(1)
  println(1.pure[List])
// res5: List[Int] = List(1)

  import cats.Monad
  import cats.syntax.functor._ // for map
  import cats.syntax.flatMap._ // for flatMap
  import scala.language.higherKinds

  def sumSquare[F[_]: Monad](a: F[Int], b: F[Int]): F[Int] =
    a.flatMap(x => b.map(y => x * x + y * y))
  import cats.instances.option._ // for Monad
  import cats.instances.list._ // for Monad
  println(sumSquare(Option(3), Option(4)))
// res8: Option[Int] = Some(25)
  println(sumSquare(List(1, 2, 3), List(4, 5)))
// res9: List[Int] = List(17, 26, 20, 29, 25, 34)
}
