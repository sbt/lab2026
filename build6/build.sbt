val toolkitV = "0.5.0"
val toolkit = "org.scala-lang" %% "toolkit" % toolkitV
val toolkitTest = "org.scala-lang" %% "toolkit-test" % toolkitV

scalaVersion := "3.9.0"
libraryDependencies += toolkit
libraryDependencies += (toolkitTest % Test)
