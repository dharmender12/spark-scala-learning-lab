// for loop is not just counter but can be used for expressive coding.
// For loop can be used with list,tuple or dictionary. 

// Range inclusive 
object forloop extends App{
//for (i <- 1 to 5) println(i)

// Exclusive 
//for (i <- 1 until 5) println(i)

// with step 
//for (i<-1 to 10 by 2)println(i)

// with collection 
val cities = List("jaipur","Jalandhar","Ludhiana")

for (city<- cities) {
    println(s"$city is beautiful.")
}

}  
    


