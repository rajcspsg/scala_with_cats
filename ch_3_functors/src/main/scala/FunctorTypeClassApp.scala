object FunctorTypeClassApp extends App {
    import scala.language.higherKinds
    import cats.Functor
    import cats.instances.list._
    import cats.instances.option._

    val list1 = List(1, 2, 3)

    val list2 = Functor[List].map(list1)(_ * 2)

    println(s"list2 $list2")

    val option1 = Option(123)
    val option2 = Functor[Option].map(option1)(_.toString)

    println(s"option2 $option2")

    val func = (x: Int) => x + 1
    
    val liftedFunc: Option[Int] => Option[Int] = Functor[Option].lift(func)

    println(liftedFunc(Option(1)))
}