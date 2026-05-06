package com.student.lakehouse
// import org.apache.spark._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.DataFrame

object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
    .appName("Amazon review Lakehouse")
    .master("local[*]")
    .getOrCreate()

    //
    val silverDF = SilverLayer.run(spark)
    val goldDF = goldLayer.run(spark,silverDF)

    println("Pipeline Complete")
 
    spark.stop()
 
  }
 
  
}