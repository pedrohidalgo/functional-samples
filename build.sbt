name := "functional-programming"
 
version := "1.0"
 
scalaVersion := "2.11.7"

// set the main class for 'sbt run'
mainClass in (Compile, run) := Some("Main")
 
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
 
libraryDependencies += "org.specs2" %% "specs2" % "2.4.1"
