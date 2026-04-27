object transform 
    {
        def main(args: Array[String]): Unit = {
                // val data = for i <- 1 to 10 yield i

                // val res1= data.toList
                // // println(result)

                // val result = res1.filter(_ % 2 == 0).map(_*10).flatMap(x =>List(x,x+1)).reduce(_+_)

                // println(result)

            val transaction = List(
                ("Mobile",25000,"success"),
                ("Laptop",60000,"success"),
                ("Charger",1200,"Failed"),
                ("Mobile",32000,"success")
            )
            val revbycategory = transaction
            .filter{case (_,_,status) => status =="success"}
            .map{case (category,revenue,_) => (category,revenue)}
            .groupBy{case (category,_) => category}
            .map{case (category, list) => (category,list.map(_._2).sum)}        // 1. Filter according to status == 'status'
            println(revbycategory)
        // Map each order to (category,revenue)
        // 2. group by category
        // 3. reduce to calculate total revenue per category.
        import scala.io.Source

        val csvData = Source.fromFile("Data.csv")
        val lines = source.getLines().toList

        // write a file 
        import java.io.PrintWriter
        val writer = new PrintWriter("output.txt")
        writer.println("Hello this is first scala file.")
        writer.println("Preparing  for spark...")
        writer.close()
        println("File written successfully.")
        

    }
    }