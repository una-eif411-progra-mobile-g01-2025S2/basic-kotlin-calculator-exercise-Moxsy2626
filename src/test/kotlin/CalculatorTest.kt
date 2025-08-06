package calculator

import kotlin.test.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

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

    @Test
    fun testDivisionByZeroThrowsException() {
        val exception = assertFailsWith<IllegalArgumentException> {
            calculator.divide(10.0, 0.0)
        }
        assertEquals("Cannot divide by zero", exception.message)
    }
}
