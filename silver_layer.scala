package com.student.lakehouse

import org.apache.spark.sql.{SparkSession, DataFrame}
import org.apache.spark.sql.functions._

object SilverLayer {

  def run(spark: SparkSession): DataFrame = {

    import spark.implicits._

    // ================================
    //  LOAD BRONZE DATA
    // ================================
    val bronzeDF = spark.read
      .option("header","true")
      .option("inferSchema","true")
      .csv("/home/dharmender/amazon-reviews-project/" +
        "scala/src/main/scala/com/student/lakehouse/data/Amazon_Reviews.csv")

    // ================================
    //  TRANSFORMATIONS
    // ================================
    val silverDF: DataFrame = bronzeDF

      // Extract numeric rating
      .withColumn("rating_clean",
        regexp_extract(col("Rating"), "\\d+", 0)
      )
      .withColumn("rating_clean",
        when(col("rating_clean") === "", null)
          .otherwise(col("rating_clean").try_cast("int"))
      )

      // Extract review count
      .withColumn("review_count_clean",
        regexp_extract(col("Review Count"), "\\d+", 0).try_cast("int")
      )

      // Clean text
      .withColumn("review_text_clean",
        lower(trim(col("Review Text"))))
      
      .withColumn("review_title_clean",
      lower(trim(col("Review Title"))))
      // Feature engineering
      .withColumn("review_length", length(col("review_text_clean")))

      // Handle nulls properly
      .na.fill(Map(
        "review_text_clean" -> "no review provided",
        "rating_clean" -> 0,
        "review_count_clean" -> 0
      ))
      
      // Convert timestamp (FIXED FORMAT)
      .withColumn("review_timestamp",
        try_to_timestamp(col("Review Date"), lit("yyyy-MM-dd'T'HH:mm:ss.SSSX"))
      )
    

      // Extract time features
      .withColumn("year", year(col("review_timestamp")))
      .withColumn("month", month(col("review_timestamp")))

      // Sentiment (FIXED LOGIC)
      .withColumn("sentiment",
        when(col("rating_clean") >= 4, "positive")
          .when(col("rating_clean") === 3, "neutral")
          .otherwise("negative")
      )

      // Normalize country
      .withColumn("country", lower(trim(col("Country"))))

      // Select final columns
      .select(
        col("country"),
        col("rating_clean"),
        col("review_count_clean"),
        col("review_text_clean"),
        col("review_title_clean"),
        col("review_length"),
        // col("review_timestamp"),
        col("year"),
        col("month"),
        col("sentiment")
      )

    // ================================
    //  OUTPUT
    // ================================
    silverDF.printSchema()

    // ================================
    //  SAVE
    // ================================
    silverDF.write
      .mode("overwrite")
      .parquet("data/silver/amazon_review_silver")

    println("Silver layer saved successfully")

    // IMPORTANT RETURN
    silverDF
  }
}