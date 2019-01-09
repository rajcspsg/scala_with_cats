object InVariantFunctorApp extends App {
  /*trait Codec[A] {
    self => 
    def encode(value: A): String
    def decode(value: String): A
    def imap[B](dec: A => B, enc: B => A): Codec[B] = new Codec[B] {
        def encode(value: B): String = self.encode(enc(value))
        def decode(value: String): B = dec(self.decode(value))
        def imap[C](dec: B => C, enc: C => B): Codec[C] = new Codec[C]
    }
  }
  def encode[A](value: A)(implicit c: Codec[A]): String =
    c.encode(value)
  def decode[A](value: String)(implicit c: Codec[A]): A =
    c.decode(value)
    */
}
