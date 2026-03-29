fun main(args: Array<String>) {
    // Array - it is a collection of items that are related in nature
    // to access an item of an array we ise the index starting from index zero
    // to create an array we use the arrayOf function/method

    val numbers = arrayOf(25, 54, 54 ,32, 74, 36, 74,31)

    println(numbers.contentToString())

    // accessing items of an array
    println("Item in index three is: "+ numbers[3])
}