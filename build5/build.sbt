scalaVersion := "3.9.0"
organization := "com.example"

lazy val somethingTask = taskKey[String]("something")

lazy val core = project
  .settings(
    somethingTask := Greeting.greeting
  )
