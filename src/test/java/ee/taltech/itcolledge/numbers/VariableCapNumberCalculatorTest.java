package ee.taltech.itcolledge.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class VariableCapNumberCalculatorTest {

    @Test
    public void variable_calculator_of_1_caps_at_1() {
        VariableCapNumberCalculator calculator = new VariableCapNumberCalculator(1);
        assertEquals(1, calculator.sum(1, 1));
        assertEquals(-1, calculator.sum(0, -1));
    }
}