import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();
//    Calculator calculator;
//
//    @Before
//    public void setUp() {
//        calculator=new Calculator();
//    }

    @Test
    public void rootTruePositive()
    {
        assertEquals("Square root of number for True Positive", 10, calculator.root(100), DELTA);
        assertEquals("Square root of number for True Positive", 5, calculator.root(25), DELTA);
    }

    @Test
    public void rootFalsePositive()
    {
        assertNotEquals("Square root of number for False Positive", 12, calculator.root(121), DELTA);
        assertNotEquals("Square root of number for False Positive", 4, calculator.root(17), DELTA);
    }


    @Test
    public void factorialTruePositive()
    {
        assertEquals("Factorial of number for True Positive", 24, calculator.factorial(4), DELTA);
        assertEquals("Factorial of number for True Positive", 120, calculator.factorial(5), DELTA);
    }
    @Test
    public void factorialFalsePositive()
    {
        assertNotEquals("Factorial of number for False Positive", 125, calculator.factorial(5), DELTA);
        assertNotEquals("Factorial of number for False Positive", 40, calculator.factorial(4), DELTA);
    }

    @Test
    public void logTruePositive()
    {
        assertEquals("Natural Log of number for True Positive", 3.912023005428146, calculator.log(50), DELTA);
        assertEquals("Natural Log of number for True Positive", 4.499809670330265, calculator.log(90), DELTA);
    }

    @Test
    public void logFalsePositive()
    {
        assertNotEquals("Natural Log for False Positive", 12, calculator.log(121), DELTA);
        assertNotEquals("Natural Log for False Positive", 4, calculator.log(17), DELTA);
    }
    @Test
    public void powerTruePositive()
    {
assertEquals("power of number for true positive",729,calculator.power(9,3),DELTA);
assertEquals("power of number for true positive",625,calculator.power(5,4),DELTA);
    }
    @Test
    public void powerFalsePositive()
    {
        assertNotEquals("power of number for False Positive", 900, calculator.power(9,3), DELTA);
        assertNotEquals("power of number for False Positive", 120, calculator.power(5,3), DELTA);
    }
    }


