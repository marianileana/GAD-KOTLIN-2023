package lab2

import java.util.Scanner

fun reverseString(str: String): String {
    var reversed = ""
//    v2
//    for (i in str.length - 1 downTo 0) {
//        reversed += str[i]
//    }
    reversed = str.reversed()
    return reversed
}


fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a string to reverse: ")
    val input = scanner.nextLine()
    val reversed = reverseString(input)
    println("Reversed string: $reversed")
}
