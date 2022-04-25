package Lesson21;

import Lesson21.Calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldCalculatorCanSum() {
        Calculator calculator = new Calculator(10, 15);
        int result = calculator.summa();
        Assert.assertEquals(25, calculator.summa());

        Calculator calculator1 = new Calculator(-10, 3);
        int result2 = calculator.summa();
        Assert.assertEquals(-7, calculator1.summa());

    }
}
