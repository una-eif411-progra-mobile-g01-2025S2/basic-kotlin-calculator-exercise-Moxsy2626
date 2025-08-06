package calculator

fun main() {
    val calculator = Calculator()

    val sum = calculator.add(5.0, 3.0)
    println("Sum: $sum") // Output: 8.0

    val difference = calculator.subtract(10.0, 4.0)
    println("Difference: $difference") // Output: 6.0

    val product = calculator.multiply(2.0, 3.0)
    println("Product: $product") // Output: 6.0

    val quotient = calculator.divide(10.0, 2.0)
    println("Quotient: $quotient") // Output: 5.0
}
