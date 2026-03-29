// when Statement
// when Statement The when statement in Kotlin is like a switch case in other languages. It checks a value against multiple conditions and executes the matching block.

fun main() {
    val marks = 7

    when(marks){
        in 1 .. 30 -> println("You failed")
        in 31 .. 50 -> println("You have Average")
        in 51 .. 70 -> println("You passed")
        in 71 .. 100 -> println("You passed")
        else -> println("Invalid scores...!")
    }
}