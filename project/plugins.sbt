import sbt._

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += Classpaths.typesafeReleases

libraryDependencies <+= sbtVersion("org.scala-sbt" % "scripted-plugin" % _)

// sbteclipse
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.3.0")

// sbtidea
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")