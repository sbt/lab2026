val toolkitV = "0.5.0"
val toolkit = "org.scala-lang" %% "toolkit" % toolkitV
val toolkitTest = "org.scala-lang" %% "toolkit-test" % toolkitV

version := "0.1.0-SNAPSHOT"
scalaVersion := "3.9.0"

val foo = taskKey[HashedVirtualFileRef]("")
@transient
val readStr = taskKey[String]("")

lazy val core = project
  .settings(
    libraryDependencies += toolkit,
    libraryDependencies += (toolkitTest % Test),
    foo := {
      val conv = fileConverter.value
      val t = target.value
      val outFile = t / "foo.txt"
      IO.write(outFile, "testtest")
      val out = conv.toVirtualFile(outFile.toPath())
      Def.declareOutput(ouut)
      out
    },
    readStr := {
      val conv = fileConverter.value
      val x = foo.value
      IO.read(conv.toPath(x).toFile)
    },
  )
