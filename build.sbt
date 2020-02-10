name := "DatabricksScalaDemo"

version := "0.1"

scalaVersion := "2.11.12"

//The environment variable SPARK_JAR_PATH must be set to databricks connect jar path that can be returned
//from the conda environment where databricks connect is installed by running:
//      conda activate <your env where databricks connect is installed>
//      databricks-connect get-jar-dir
//      
//
//if on linux or mac you can set this variable dynamically using the following in the bash profile after the conda config setup.
//      conda activate <your env where databricks connect is installed>
//      export SPARK_JAR_PATH=$(databricks-connect get-jar-dir)
//      conda activate base

lazy val sparkJarPath = sys.env("SPARK_JAR_PATH")
unmanagedBase := new java.io.File(sparkJarPath)

libraryDependencies += "com.databricks" % "dbutils-api_2.11" % "0.0.4"

