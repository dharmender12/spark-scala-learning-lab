//  Continue: 

// Anonymous function : is a function without a name and it is 
// one line function. It is denoted by =>.
// It is also known as Lambda function. Very common in Scala and Spark.

// object anonymous_func extends App { 
    // val square = (x:Int) => x*x
    // println(square(8))

// map takes each element of a collection, applies function on it and returns new collection 
// from this. 
    // val nums = List(1,4,6,8)
    // val doubled = nums.map(x=>x*2)
    // println(doubled)
// List of strings 
    // val names = List("dhanush","Balaji","Yaqub","Manas")
    // val upper = names.map(_.capitalize)
    // println(upper)
// }


// In uber's dynamic pricing Spark job,
//   they apply different surge multipliers using anonymous function


// Mapper and filer and placeholder 

// object uberpricing extends  App{

//     val surge = List(1.2,1.5,1.8,2.0)
//     val base_price = 20 
//     val time1 = List("Morning","Noon","Evening","Night")
//     println(surge(0))
//     for (t <- time1) {
//     if (t=="Morning") {
//         val price = base_price*surge(0)
//         println(price) 
        
//     }
// }

// }

// Filter

object Filtering extends App {

    val number = for (i <- 1 to 20) yield i
    val result = number.filter(_%2 == 0)
    println(result)
    val reduced = number.reduce(_+_)
    println(reduced)

}


