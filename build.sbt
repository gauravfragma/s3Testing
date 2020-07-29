
name := "s3Testing"

version := "0.1"

scalaVersion := "2.11.12"


libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.0"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.3.0"
libraryDependencies += "com.microsoft.sqlserver" % "mssql-jdbc" % "6.4.0.jre8"
libraryDependencies += "com.microsoft.azure.iothub-java-client" % "iothub-java-device-client" % "1.0.15"
libraryDependencies += "com.microsoft.azure" %% "azure-eventhubs-spark" % "2.3.6"
libraryDependencies += "org.apache.hadoop" % "hadoop-azure" % "2.7.3"
libraryDependencies += "com.microsoft.azure" % "azure-storage" % "3.1.0"
libraryDependencies += "com.zaxxer" % "HikariCP" % "3.2.0"
libraryDependencies += "io.spray" %% "spray-json" % "1.3.5"
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.28"
libraryDependencies += "com.sun.mail" % "javax.mail" % "1.6.1"
