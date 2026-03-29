fun main() {
    // Functions with parameters
    // Parameter are inputs that get passed as arguements when invoking a function
    // Note: For parameters to work you must specify ther data type

    fun greeting (name : String){
        println("Hello $name, Hope you had a good Day?")
    }
    // When the function is invoked you pass a given name as an argument
    greeting("James")
    greeting("Sylvia")

    println("=============================")

    // Bellow is an example of a function that is able to calculate the bmi of a person

    fun BMI( weight : Double, height : Double){
         val answer = weight / (height * height)

    println("The BMI of a person is: $answer")
    }
   
    BMI(69.6, 1.73)

    println("==================")

    // create a function that accepts paramethers and checks whether a given number is odd or even
    fun number(num : Int){
        if(num % 2 ==0){
            println("$num is an even number")
        }
        else{
            println("$num is an odd number")
        }
    }

    number(9)
}

// Create a function that accepts parameter that is able to do the coversion of degree celcius into farenheight

// create a function that is able to calculate the compound interest of a person

// Research on inheritance in kotlin 