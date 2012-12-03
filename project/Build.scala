import sbt._
import Keys._
import PlayProject._
import sbtassembly.Plugin.AssemblyKeys._
import com.gu.deploy.PlayArtifact._
 
object ApplicationBuild extends Build {
 
  val appName         = "dummy-app"
  val appVersion      = "1.0"
 
  val appDependencies = Nil
 
  val main = PlayProject(appName, appVersion, appDependencies, mainLang=SCALA)
    .settings( playArtifactDistSettings: _* )
    .settings(
      jarName in assembly := "%s.jar" format appName
    )

}
