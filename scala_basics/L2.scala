// What is REPL ? 
// REPL stands for Read - Evaluate - Print - Loop. 
// It's an intractive CLI (Command Line Interface) where you can write
// your scala codes and scala immediately runs it and show the result. 
// It is useful for small codes and debugging.

// What is sbt ? 
// Simple build tool ( Now a days called sbt only) It is the standard 
// build tool for Scala projects similar to Maven/Gradle in Java. or npm in javascript. 
// sbt has does many thing : 
// Compiles your scala codes 
// runs you programs 
/// Runs tests 
// Package your app (jar files)
// And most importantly for learning gives you project aware REPL. 
// on cosole write sbt and it will work. 

// credit card fraud detection 

object ifcondition extends App{
    val temp = 18
    val feeling = if ( temp >= 35) "Very High"
              else if (temp >= 30) "High"
              else if (temp >=20) "Pleasant"
              else "Cool"
    println (feeling)
}


// Home work write the code for voters. 
// If voter age is above 18 he/she can vote otherwise not and check if age is < 0 also..


