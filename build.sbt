name := MyBuild.NamePrefix + "root"

version := Common.APP_VERSION

scalaVersion := Common.SCALA_VERSION

organization := Common.ORGANIZATION

lazy val core = project.
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.coreDependencies)