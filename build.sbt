import scalariform.formatter.preferences._

val commonSettings = Seq(
  scalaVersion := "2.11.8",
  organization := "io.leonard",
  scalacOptions ++= Seq("-Xfatal-warnings", "-feature", "-language:postfixOps"))

scalariformSettings ++ Seq(
  ScalariformKeys.preferences := ScalariformKeys.preferences.value
    .setPreference(AlignSingleLineCaseStatements, true)
    .setPreference(DoubleIndentClassDeclaration, true)
    .setPreference(PreserveDanglingCloseParenthesis, true)
    .setPreference(PreserveSpaceBeforeArguments, true)
)

lazy val `sbt-template` = project.in(file(".")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-api" % "1.7.21",
      "org.scalatest" %% "scalatest" % "3.0.0" % "test"
    )
  )

