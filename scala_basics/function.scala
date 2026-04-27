object functions extends App{
    //simple named function 
//     def add(a: Int,b:Int): Int = { 
//         return a+b
//     }
// // calling a function 
//     val addition = add(1,3)
//     println(addition)

//2. Multi line function : 
// def describeNumbers(n:Int): String = {
//     if (n > 0) "Positive"
//     else if (n < 0) "Negative"
//     else "Zero"
// }
// val describe = describeNumbers(5)
// println(describe)

// Anonymous function (Lambda)
// val square = (x:Int ) => x*x
// println(square(3))

// 4. High-order function (function that takes or returns function as output)
// def transform (n:Int, f: Int =>Int) : Int = 
// f(n)
// println(transform(5,x=>x*x))
// println(transform(5,x=>x*10))

// 5. Closure 
// This function captures variables from outer scope

// def makemultiplier(factor: Int):Int => Int = { 
//     (x: Int) => x *factor
// }
// val triple = makemultiplier(3)
// println(triple(10))

 }



