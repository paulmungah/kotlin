fun main() {
    // for loop -is used to exxecute a block of code / statement a number of times until a condition is met

    for(number in 1 .. 10){
        println("The count is: $number")
    }

    println("===========")

    // create a for loop that is able to print from 50 to 65

    for(number in 50 .. 65){
        println("The number $number")
    }
    //  // research on how to increment on the for loop by use of steps
    println("===============")

    for(x in 21 .. 40 step 2){
        println("$x is an odd number")
    }

    println("===================")

    // below we find the odd number in a given range
    for(x in 20 .. 40){
        if (x % 2 !=0){
            println(x)
        }
    }
    
     println("===================")
    // by use of a for loop generate the multiplication table for 5 from 0 to 5

    for( n in 1 .. 5){
        println("5 x $n = ${5* n}")
    }

    println("===================")

    for (a in 1..5) {
        val prod = a * 5
        println("5 x $a = $prod")
    }

    println("===================")
    // create a program that is able to find the factorial of number 5

    var factorial =1

    for( n in 1 ..5){
        
         factorial= factorial * n

        println(factorial)
    }
    println("The factorial of 5 is $factorial")
 
}


// Check on the difference between local variables and global variables