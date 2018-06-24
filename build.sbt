
name := "Scala-For-The-Impatient-exercises"

version := "0.1"

scalaVersion := "2.12.5"

val scalaTestV = "3.0.1"

lazy val baseSettings =
  Seq(organization := "com.patmcdermott", scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xlint"))

lazy val root = project
  .in(file("."))
  .aggregate(
    five,
    six,
    eight,
    util)

lazy val five = (project in file("five"))
  .settings(baseSettings: _*)
  .settings(name := "five")
  .configs(IntegrationTest)
  .settings(Defaults.itSettings: _*)
  .dependsOn(util % "it,test->test;compile->compile")

lazy val six = (project in file("six"))
  .settings(baseSettings: _*)
  .settings(name := "six")
  .configs(IntegrationTest)
  .settings(Defaults.itSettings: _*)
  .dependsOn(util % "it, test->test;compile->compile")

lazy val eight = (project in file("eight"))
  .settings(baseSettings: _*)
  .settings(name := "eight")
  .configs(IntegrationTest)
  .settings(Defaults.itSettings: _*)
  .dependsOn(util % "it, test->test;compile->compile")

lazy val util = (project in file ("util"))
  .settings(baseSettings: _*)
  .settings(name := "util")
  .configs(IntegrationTest)
  .settings(Defaults.itSettings: _*)
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalatest"          %% "scalatest"         % scalaTestV % "it,test",
        "commons-io"             % "commons-io"         % "2.4",
        "org.scala-lang.modules" %% "scala-xml"         % "1.0.6"
      )

  )

