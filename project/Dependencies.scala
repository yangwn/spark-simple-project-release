import sbt._
import Keys._


/*********************************************************************************************
 * Jar包管理: 
 *  1).jar的依赖与依赖关系
 *  2).打包策略
 *
 * Notice:
 *  %% --> find jar for specified scala version.
 *  %  --> don't need specified scala version. For example, the lib compile with Java.
 *********************************************************************************************/
object Dependencies {

  //Common
  val commonDependencies: Seq[ModuleID] = Seq(
    "org.scalaz" %% "scalaz-core" % "7.2.14",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",
    "junit" % "junit" % "4.12" % "test"
  )
  
  //Json
  val json : Seq[ModuleID] = Seq(
      // "io.argonaut" %% "argonaut" % "6.0.4",
      // "com.propensive" %% "rapture-json-argonaut" % "1.1.0",
      // "com.typesafe.play" %% "play-json" % "2.4.2"
  )

  //Core
  val coreDependencies   : Seq[ModuleID] = commonDependencies
}