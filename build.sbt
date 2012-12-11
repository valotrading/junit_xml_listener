sbtPlugin := true

name := "junit_xml_listener"

organization := "eu.henkelmann"

version := "0.3"

scalacOptions := Seq("-deprecation", "-unchecked")

publishMavenStyle := true

publishTo := Some(Resolver.file("GitHub Pages", file("../junit_xml_listener-gh-pages/maven/")))
