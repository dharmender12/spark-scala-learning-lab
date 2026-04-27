// class Smarphone {
//     var namecompany : String = "Apple"
//     var number : Int = 16

//     def display():Unit =
//     {
//         println("Name of the company "+namecompany)
//         println("Total number of smartphone generations"+ number)
//     }
// }

// object  main
//     { 
//         def main(args: Array[String]): Unit = {
//                 var obj = new Smarphone();
//                 obj.display()
//         }
//     }


// single inheritance 
class Parent { 
    var name : String = "Ankit"
}
class child extends Parent 
    { 
        var age = 22
        def details() = { 
            println("Name"+ name)
            println("age"+age)
        }
    }


object classes1{
    def main(args: Array[String]): Unit = {
        val ob = new child()
        ob.details()
    }
}