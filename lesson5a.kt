class Person {
    // Attributes of a person
    var name = "James"
    var age = 45
    var weight = 55
    var height = 2

    // behaviours /actions 
    fun walk(){
        println("The person can walk")
    }
    fun speak(){
        println("The person can speak...")
    }
    fun sing(){
        println("world best singer")
    }
    fun laugh(){
        println("best in laughing")
    }
}

fun main(){
    // object is a real world thing
    // An object is intaciated from class
    // for us to be able to either access the properties /behaviours of a class we require to have an object

    // below we create an object
    var myObject = Person()

    // below we use the dot separator to access the function or the properties
    myObject.walk()

    println("the age of the person is:"+myObject.age)
    myObject.laugh()
}