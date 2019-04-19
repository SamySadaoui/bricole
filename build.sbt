name := "PLDAC"

version := "0.1"

scalaVersion := "2.11.11"

val sparkVersion = "2.3.2"
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-mllib" % sparkVersion