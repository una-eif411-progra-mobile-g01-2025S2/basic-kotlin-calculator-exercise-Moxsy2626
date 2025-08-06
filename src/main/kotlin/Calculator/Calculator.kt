package calculator

/** Clase Calculator hace operaciones básicas de una calculadora. **/

class Calculator {

    /** Suma dos números. **/
    fun add(a: Double, b: Double): Double = a + b

    /** Resta el segundo número al primero. **/
    fun subtract(a: Double, b: Double): Double = a - b

    /** Multiplica dos números. **/
    fun multiply(a: Double, b: Double): Double = a * b

    /**Divide el primer número entre el segundo. Lanza una excepción si se intenta dividir entre cero. **/
    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("No se puede dividir entre cero")
        }
        return a / b
    }
}
