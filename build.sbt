
name := "SalesForceToSpark"

version := "1.0"

scalaVersion := "2.11.8"


unmanagedJars in Compile += file("C:/Users/yalla/Downloads/sqljdbc4-4.0.jar")

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.2.0",
  "org.apache.spark" % "spark-sql_2.11" % "2.2.0",
  "com.springml" % "spark-salesforce_2.11" % "1.1.0",
  "com.typesafe" % "config" % "1.2.1",
  "org.apache.spark" % "spark-hive_2.11" % "2.2.0",
  "com.databricks" %% "spark-csv" % "1.5.0"
)

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
