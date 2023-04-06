import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a list of numbers, separated by commas: ")

    // Read the input & convert it into a list of Doubles
    val input = scanner.nextLine()
    val numbers = mutableListOf<Double>()
    for (num in input.split(",")) {
        try {
            numbers.add(num.trim().toDouble())
        } catch (e: NumberFormatException) {
            println("Error: Invalid input. Please enter only numbers separated by commas.")
            return
        }
    }

    // Calculate the sum of the numbers
    var sum: Double = 0.0
    for (num in numbers) {
        sum += num
    }

    // Calculate the average of the numbers
    val average = if (numbers.isNotEmpty()) sum / numbers.size else 0.0

    // Output the result to the console
    println("The average is: $average")

}