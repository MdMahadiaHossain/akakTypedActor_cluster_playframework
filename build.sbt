name := """playWithReactiveMongo"""
organization := "com.brainbinary"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += ws
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

libraryDependencies ++= Seq(
  "org.reactivemongo" %% "play2-reactivemongo" % "0.20.11-play27"
)

libraryDependencies ++= Seq(
  "org.reactivemongo" %% "reactivemongo-play-json-compat" % "0.20.11-play27"
  )

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.brainbinary.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.brainbinary.binders._"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-typed" % "2.6.1"
libraryDependencies += "com.typesafe.akka" %% "akka-remote" % "2.6.1"
