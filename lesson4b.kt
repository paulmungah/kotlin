fun main() {
    // bellow if a function that is able to add two numbers

    fun addition(){
        val num1 =10
        val num2 =20
        val sum =num1 + num2

        println("The sum of the numbers is: $sum")
    }

    addition()

    println("=============================")

    // Create a function that is able to multiply 3 numbers 
    fun product(){
        val value1=9
        val value2 =6
        val value3 =3

        val prod = value1 * value2 * value3

        print("The product of the numbers is: $prod")

    }
    product()

    println("=============================")

    // Given 179 minutes created that is able to convert the said minutes into hours and show the remainder of the minutes

    fun time(){
        val minutes = 179
        val hours = minutes / 60
        val remainder = minutes % 60

        println("$minutes minutes = $hours hours and $remainder minutes")
    }
     time()

     // Given numbers (10,38,4,24,56) create a function that is able to find the largest and smallest of the numbers

}