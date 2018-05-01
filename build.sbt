
name := "Scala-For-The-Impatient-exercises"

version := "0.1"

scalaVersion := "2.12.5"

lazy val baseSettings =
  Seq(organization := "com.patmcdermott", scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xlint"))

lazy val root = project
  .in(file("."))
  .aggregate(5)

lazy val five = (project in file("five"))
  .settings(baseSettings: _*)
  .settings(name := "five")