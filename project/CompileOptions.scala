object CompileOptions {
  val compileOptions = Seq(
    "-unchecked",
    "-deprecation",
    "-language:_",
    "-encoding", "UTF-8",
    "-Ypartial-unification",
    "-Xfatal-warnings",
    "-Yliteral-types",
    "-language:higherKinds"
  )
}