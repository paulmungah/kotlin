// 
class Circle{
    // properties
    var radius = 7
    var pie = 3.142

    // behaviours 
    fun circleArea(){
        val areaofcircle = pie * radius * radius
        println("The area of the circle is:"+areaofcircle) 
    }
    fun circlecircumference () {
        val circlecircumference = 2 * pie * radius

        println("The circumference of circle is:"+circlecircumference)
    }
}
fun main() {
    // object 
    var myCircle = Circle()
    myCircle.circleArea()
    myCircle.circlecircumference()
    
    var myRectangle = Rectangle()
    myRectangle.rectanglearea()
}
class Rectangle{
    // props 
    var length = 40
    var width = 20

    fun rectanglearea(){
        val rectanglearea = length*width
        println("The area of rectangle is:"+rectanglearea)
    }
}


