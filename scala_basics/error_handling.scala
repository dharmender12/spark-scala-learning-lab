object error_handling {
    def main(args:Array[String]):Unit = {
        try {
            val result = 11/2
            println(result)
            
        }
        catch  {

            case x : 
            ArithmeticException => 
                {
                    println("Exception: A no. is not divisible by zero")
                }
        }
    }
}