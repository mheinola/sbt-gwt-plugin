sbtPlugin := true

organization := "net.thunderklaus"

name := "sbt-gwt-plugin"

version := "1.2-SNAPSHOT"

crossScalaVersions := Seq("2.9.2", "2.10.0")

scalacOptions ++= Seq("-unchecked", "-deprecation")

// Hard coded url for now
libraryDependencies += "com.earldouglas" %% " xsbt-web-plugin_2.10_0.12" % "0.3.0" % "provided" from "https://oss.sonatype.org/content/repositories/releases/com/earldouglas/xsbt-web-plugin_2.10_0.12/0.3.0/xsbt-web-plugin-0.3.0.jar"

seq(ScriptedPlugin.scriptedSettings: _*)

publishMavenStyle := true

publishTo := Some("Sonatype Nexus Repository Manager" at System.getProperty("nexusRepositoryUrl", "none"))

credentials += Credentials("Sonatype Nexus Repository Manager", System.getProperty("nexusUrl", "none"), System.getProperty("nexusUser", "none"), System.getProperty("nexusPassword", "none"))
