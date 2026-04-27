// A case class is just like a regular class.
case class employee 
(name: String, age: Int)

object case_class
{
 def main(args: Array[String]): Unit= { 
    var c = employee("Nitish",age = 21)
    // Display 
    println("Name and age of the employee " + c.name)

 }
}
