from pyspark.sql import SparkSession
from pyspark.sql.functions import * 

spark = SparkSession.builder \
        .appName("Amazon review -Silver Layer (PySpark)") \
        .master("local[*]") \
        .getOrCreate()

print("Pyspark Silver layer started ")

df = spark.read \
    .option("header","true") \
    .option("inferSchema","true") \
    .csv("/home/dharmender/amazon-reviews-project/scala/src/main/scala/com/student/lakehouse/data/Amazon_Reviews.csv")

df.printSchema()

# Cleaning 
clean_df = df \
.drop("Reviewer Name","Profile Link","Date of Experience") \
.withColumnRenamed("Review Text","review_text")

clean_df.printSchema()
