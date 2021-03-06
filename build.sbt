sbtPlugin := true

organization := "net.thunderklaus"

name := "sbt-gwt-plugin"

version := "1.2-SNAPSHOT"

sbtVersion in Global := "0.13.0"

scalaVersion in Global := "2.10.2"

crossScalaVersions := Seq("2.10.0", "2.10.2")

scalacOptions ++= Seq("-unchecked", "-deprecation")

//addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "0.4.2")
addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "0.4.2" % "provided" from "https://oss.sonatype.org/content/repositories/releases/com/earldouglas/xsbt-web-plugin_2.10_0.13/0.4.2/xsbt-web-plugin-0.4.2.jar")

seq(ScriptedPlugin.scriptedSettings: _*)

publishMavenStyle := true

publishTo := Some("Sonatype Nexus Repository Manager" at System.getProperty("nexusRepositoryUrl", "none"))

credentials += Credentials("Sonatype Nexus Repository Manager", System.getProperty("nexusUrl", "none"), System.getProperty("nexusUser", "none"), System.getProperty("nexusPassword", "none"))
