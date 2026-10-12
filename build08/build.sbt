val toolkitV = "0.5.0"
val toolkit = "org.scala-lang" %% "toolkit" % toolkitV
val toolkitTest = "org.scala-lang" %% "toolkit-test" % toolkitV

version := "0.1.0-SNAPSHOT"
scalaVersion := "3.9.0"

lazy val core = project
  .settings(
    libraryDependencies += toolkit,
    libraryDependencies += (toolkitTest % Test),
  )

lazy val app = project
  .dependsOn(core)
  .settings(
    libraryDependencies += toolkit,
    libraryDependencies += (toolkitTest % Test),
  )
