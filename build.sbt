name := "akka-sbt"

version := "0.1"

scalaVersion := "2.9.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

seq(webSettings :_*)

// Uncomment the following line if you plan to use netbeans
//seq(netbeans.NetbeansTasks.netbeansSettings:_*)


{
	val akkaVersion = "2.0-SNAPSHOT"
	libraryDependencies ++= Seq(
		"se.scalablesolutions.akka" % "akka-actor" % akkaVersion,
                "se.scalablesolutions.akka" % "akka-http" % akkaVersion
	)
}

libraryDependencies ++= Seq(
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "jetty"
)
