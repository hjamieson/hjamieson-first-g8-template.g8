// give the user a nice default project!
ThisBuild / organization := "org.hugh"
ThisBuild / scalaVersion := "2.13.0"

lazy val root = (project in file(".")).
  settings(
    name := "first g8 template"
  )
