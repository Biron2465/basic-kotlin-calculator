package basic.calculator

import com.github.stefanbirkner.systemlambda.SystemLambda
import design.patterns.basic.calculator.Calculator
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class CalculatorTest {
    private val standardOut = System.out
    private val outputStreamCaptor = ByteArrayOutputStream()

    @BeforeEach
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor))
    }

    @AfterEach
    fun tearDown() {
        System.setOut(standardOut)
    }

    @Test
    fun `Resultado de la suma`() {

        val output = Calculator(6,2,"+").Calculate()

        Assertions.assertEquals(
            8,
            output
        )
    }
    @Test
    fun `Resultado de la resta`() {

        val output = Calculator(6,2,"-").Calculate()

        Assertions.assertEquals(
            4,
            output
        )
    }
    @Test
    fun `Resultado de la multiplicación`() {

        val output = Calculator(6,2,"*").Calculate()

        Assertions.assertEquals(
            12,
            output
        )
    }
    @Test
    fun `Resultado de la división`() {

        val output = Calculator(6,2,"/").Calculate()

        Assertions.assertEquals(
            3,
            output
        )
    }

}