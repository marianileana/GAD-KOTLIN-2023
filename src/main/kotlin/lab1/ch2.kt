package lab1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter your name: ")
    val name = scanner.nextLine()
    print("Enter your age: ")
    val age = scanner.nextInt()


    // Add logic to print greeting based on age
    val greeting = when {
        age < 18 -> "You're still young, $name!"
        age in 18..65 -> "You're in your prime, $name!"
        else -> "You're a wise elder, $name!"
    }
    println(greeting)
}