//fundamental concept in OOPs it is similar to interface in Java.
trait Printable 
{
    def print : Unit = {
        println("Printing...")
    }
}

class newClass extends Printable 
{
    override def print: Unit = {
        println("This is the Class on Traits")
    }
}

object main 
{ 
    def main(args: Array[String]): Unit = {
        val traits = new newClass()
        traits.print


    }
}