import sbt._

object DeployPlugins extends Build {
  val playArtifactPluginVersion = "2.2"

  lazy val plugins = Project("deploy-plugins", file("."))
    .dependsOn(
      uri("git://github.com/guardian/sbt-dist-plugin.git#1.5"),
      uri("git://github.com/guardian/sbt-play-artifact.git#" + playArtifactPluginVersion)
    )
}