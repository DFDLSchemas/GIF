name := "dfdl-gif"

organization := "com.mitre"

version := "0.0.1"

scalaVersion := "2.11.8"

crossPaths := false

testOptions in ThisBuild += Tests.Argument(TestFrameworks.JUnit, "-v")

libraryDependencies in ThisBuild := Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.apache.daffodil" %% "daffodil-tdml" % "2.1.0" % "test"
)

scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/DFDLSchemas/gif"),
    connection = "scm:git:https://github.com/DFDLSchemas/gif.git")
  )

homepage in ThisBuild := Some(url("https://github.com/DFDLSchemas/gif"))
