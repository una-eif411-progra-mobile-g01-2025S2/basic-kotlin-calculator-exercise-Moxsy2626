package calculator

import kotlin.test.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    //Test de positivos

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testAdditionPositiveNumbers() {
        val result = calculator.add(5.0, 3.0)
        assertEquals(8.0, result, "5 + 3 debe ser 8")
    }

    @Test
    fun testSubtractionPositiveNumbers() {
        val result = calculator.subtract(10.0, 4.0)
        assertEquals(6.0, result)
    }

    @Test
    fun testMultiplicationWithZero() {
        val result = calculator.multiply(5.0, 0.0)
        assertEquals(0.0, result)
    }

    @Test
    fun testDivisionNormal() {
        val result = calculator.divide(10.0, 2.0)
        assertEquals(5.0, result)
    }

    //Test de division entre cero
    @Test
    fun testDivisionByZeroThrowsException() {
        val exception = assertFailsWith<IllegalArgumentException> {
            calculator.divide(10.0, 0.0)
        }
        assertEquals("Cannot divide by zero", exception.message)
    }

    //Test de negativos y ceros

    @Test
    fun testAdditionWithNegatives() {
        val result = calculator.add(-5.0, -3.0)
        assertEquals(-8.0, result)
    }

    @Test
    fun testSubtractionWithNegativeResult() {
        val result = calculator.subtract(3.0, 8.0)
        assertEquals(-5.0, result)
    }

    @Test
    fun testMultiplicationWithNegative() {
        val result = calculator.multiply(-4.0, 2.5)
        assertEquals(-10.0, result)
    }

    @Test
    fun testDivisionWithDecimals() {
        val result = calculator.divide(7.0, 2.0)
        assertEquals(3.5, result)
    }

    @Test
    fun testLargeNumberMultiplication() {
        val result = calculator.multiply(1e10, 1e10)
        assertEquals(1e20, result)
    }

}

