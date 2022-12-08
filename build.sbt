ThisBuild / version := "1.1.0"

lazy val scala213 = "2.13.10"
lazy val scala212 = "2.12.17"
lazy val scala211 = "2.11.12"
lazy val scala32 = "3.2.1"

lazy val supportedScalaVersions = List(scala32, scala213, scala212, scala211)

ThisBuild / scalaVersion := scala213

lazy val root = (project in file("."))
  .settings(
    name := "openai-scala-models",
    crossScalaVersions := supportedScalaVersions
  )
