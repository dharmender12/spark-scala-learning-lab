object immuteDemo extends App {
    // Immutable variable 
    val x = 10 
    println("Im v mutable variable: "+x)

    // Mutable variable 
    var y = 5 
    println("mutable variable: " + y)

    // List example (immutable)
    val num =   List(2,4,3)
    val newnum = num.map(_*  5)

    println("Original list :" + num)
    println("New list after map: " + newnum)
}