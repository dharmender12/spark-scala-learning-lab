import scala.collection.immutable._
import scala.collection.mutable._
//  Immutable data types 
// List
// ListSet 
// Tuple (heterogenous)
// BitSet 
// Set 
// HashSet 
// TreeSet 

// Mutable 
// ListBuffer 
// Scala Map (key - value pair)
// ArrayBuffer 
// 

object collection { 
    def main(args:Array[String]):Unit = {
        val l1 =          List(1,2,4,5)
        var name = ListBuffer[String]()
        name += "Aryan"
        name += "Anshul"
        val l2 = l1.toList
        // name.append()
        // name.remove()``
        // name -="Anshul"

        println(name)
        println(l1)
          print(l2)


    }
}

