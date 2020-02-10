package com.shaunryan

import org.apache.spark.sql.SparkSession
import com.databricks.dbutils_v1.DBUtilsHolder.dbutils

object DatabricksScalaTutorial {
  def main() {
    val spark = SparkSession
      .builder()
      .master("local")
      .getOrCreate()
    
    println(spark.range(100).count())

    println("""
    Hello Databricks!
    """)

    dbutils.fs.ls("/").map(fileInfo => fileInfo.path).foreach(println)
    
  }
 

}