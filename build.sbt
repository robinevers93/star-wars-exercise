ThisBuild / scalaVersion     := "2.13.12"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "star-wars-exercise",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.19",
      "com.lihaoyi" %% "requests" % "0.8.0",
      "com.typesafe.play" %% "play-json" % "2.9.4",
      "org.scalatest" %% "scalatest" % "3.2.17" % Test,
      "dev.zio" %% "zio-test" % "2.0.19" % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
