package com.student.lakehouse

import org.apache.spark.sql.{SparkSession, DataFrame}
import org.apache.spark.sql.functions._

object goldLayer{
    def run(spark: SparkSession, silverDF: DataFrame): Unit = {

        import spark.implicits._ 

        println("startting Gold Layer....")

        // ====================
        // 1. country performance analysis
        // ========================
        val countryStats = silverDF.groupBy("country")
        .agg(
            count("*").alias("total_review"),
            avg("rating_clean").alias("average_rating"),
            avg("review_length").alias("avg_review_length")
        )
        .orderBy(desc("total_review"))
        println("Country Stats")
        countryStats.show(5,truncate=false)
    }
    
}
