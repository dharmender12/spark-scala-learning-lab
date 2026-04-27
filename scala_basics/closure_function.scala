// Closure function are those function which uses one or more free 
// variable and then return the values of the function which is dependent of these variable. 
 
 object sbc { 
    def main(args: Array[String]): Unit = {
        println("Final sum(1): "+sum(1))
        println("Final sum(2): "+sum(2))

    }
    var a = 5
    // define a closure function 
    val sum = (b:Int) => a+b
 }