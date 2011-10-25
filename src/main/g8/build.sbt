organization := "com.example"

name := "bbs"

version := "0.1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.5.1",
  "net.databinder" %% "unfiltered-jetty" % "0.5.1",
  "org.clapper" %% "avsl" % "0.3.6",
  "net.databinder" %% "unfiltered-spec" % "0.5.1" % "test",
  "net.databinder" %% "unfiltered-scalate" % "0.5.1" 
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)

