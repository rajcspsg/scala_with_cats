object ContraVariantFunctorsApp extends App {

  trait Printable[A] {
    self =>
    def format(value: A): String

    def contramap[B](func: B => A): Printable[B] = new Printable[B] {
      def format(value: B): String = self.format(func(value))
    }
  }

  implicit val stringPrintable: Printable[String] =
    new Printable[String] {
      def format(value: String): String =
        "\"" + value + "\""
    }

  implicit val booleanPrintable: Printable[Boolean] =
    new Printable[Boolean] {
      def format(value: Boolean): String =
        if (value) "yes" else "no"
    }

    //val hello = format("hello")
    //val b = format(true)
    //println(s"hello $hello  type = ${hello.getClass()}")
    //println(s"b $b type = ${b.getClass()}")
}
