// program allows user to choose shape and receive area
import kotlin.math.PI
fun main() {

    println("Calculate the area of a shape")
    println("1. Circle")
    println("2. Square")
    println("3. Triangle")
    println("4. Rhombus\n")

    print("Choose which shape: ")

    when (readLine()!!.toInt()) {
        1 -> circle()
        2 -> square()
        3 -> triangle()
        4 -> rhombus()
        !in 1..4 -> println("Out of range...")
        else -> println("Error.")
    }
}

fun circle() {
    print("Enter the radius: ")

    var radius = readLine()!!.toInt()
    var area = PI * radius * radius
    print("\nThe area is -> $area")
}

fun square() {
    print("Enter the side length: ")

    var side = readLine()!!.toInt()
    var area = side * side
    print("\nThe area is -> $area")
}

fun triangle() {
    print("Enter the base length: ")

    var base = readLine()!!.toInt()

    print("Enter the height: ")

    var height = readLine()!!.toInt()

    var area = .5 * base * height
    print("\nThe area is -> $area")
}

fun rhombus() {
    print("Enter the base length:")

    var base = readLine()!!.toInt()

    print("Enter the height: ")

    var height = readLine()!!.toInt()

    var area = base * height
    print("\nThe area is -> $area")
}