

name := "hello"

version := "1.0"

scalaVersion := "2.10.2"


resolvers += "Concurrent Maven Repo" at "http://conjars.org/repo"

libraryDependencies += "com.frugalmechanic" %% "scala-optparse" % "1.1.1"

libraryDependencies += "cascading" % "cascading-core" % "2.0.2"

libraryDependencies += "cascading" % "cascading-local" % "2.0.2"

libraryDependencies += "cascading" % "cascading-hadoop" % "2.0.2"

libraryDependencies += "cascading.kryo" % "cascading.kryo" % "0.4.4"

libraryDependencies += "com.twitter" % "meat-locker" % "0.3.0"

libraryDependencies += "com.twitter" % "maple" % "0.2.2"

libraryDependencies += "commons-lang" % "commons-lang" % "2.4"

// scalding (locally build)

libraryDependencies += "com.twitter" % "scalding-core_2.10" % "0.9.0rc4"

libraryDependencies += "org.apache.hadoop" % "hadoop-core" % "1.2.1"

// Invocation exception if we try to run the tests in parallel

parallelExecution in Test := false
