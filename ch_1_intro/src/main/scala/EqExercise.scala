object EqExercise extends App {

  import cats.Eq

  final case class Cat(name: String, age: Int, color: String)

  implicit val eqCat: Eq[Cat] = new Eq[Cat] {

    import cats.instances.string._
    import cats.instances.int._

    val eqStr = Eq[String]

    val eqInt = Eq[Int]

    override def eqv(x: Cat, y: Cat): Boolean = eqStr.eqv(x.name, y.name) &&
        eqInt.eqv(x.age, y.age) && eqStr.eqv(x.color, y.color)

  }

  println(eqCat.eqv(Cat("meow", 1, "Black"), Cat("kitty", 1, "White")))
  println(eqCat.neqv(Cat("meow", 1, "Black"), Cat("kitty", 1, "White")))

  val cat1 = Cat("Garfield", 38, "orange and black")
  val cat2 = Cat("Heathcliff", 33, "orange and black")
  val optionCat1 = Option(cat1)
  val optionCat2 = Option.empty[Cat]

  import cats.syntax.eq._
  import cats.instances.option._

  println(cat1 === cat2)
  println(optionCat1 === optionCat2)
  println(optionCat1 =!= optionCat2)

}
