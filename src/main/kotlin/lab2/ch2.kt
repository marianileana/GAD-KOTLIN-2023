package lab2

fun calculateTotal(items: List<String>, prices: List<Double>, tax: Double = 0.10): Double {
    var subtotal = 0.0
    for (i in items.indices) {
        subtotal += prices[i]
    }
    val total = subtotal * (1 + tax)
    return total
}

fun printReceipt(items: List<String>, prices: List<Double>, tax: Double = 0.10, formatter: (Double) -> String = { "%.2f".format(it) }) {
    var subtotal = 0.0
    println("Receipt:")
    for (i in items.indices) {
        subtotal += prices[i]
        println("${items[i]} - ${formatter(prices[i])}")
    }
    val total = calculateTotal(items, prices, tax)
    val taxAmount = total - subtotal
    println("Subtotal: ${formatter(subtotal)}")
    println("Tax: ${formatter(taxAmount)}")
    println("Total: ${formatter(total)}")
}

fun main() {
    val items = listOf("item1", "item2", "item3")
    val prices = listOf(10.0, 20.0, 30.0)

    val total = calculateTotal(items = items, prices = prices, tax = 0.15)
    println("Total cost including tax: ${"%.2f".format(total)}")

    printReceipt(items = items, prices = prices, tax = 0.15, formatter = { "$%.2f".format(it) })
}
