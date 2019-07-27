package ee.taltech.itcolledge.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberCalculatorTest {

    @Test
    public void sum_is_a_sum_of_2_numbers() {
        assertEquals(0, NumberCalculator.sum(0, 0));
        assertEquals(5, NumberCalculator.sum(5, 0));
        assertEquals(5, NumberCalculator.sum(0, 5));
        assertEquals(10, NumberCalculator.sum(5, 5));

        assertEquals(-10, NumberCalculator.sum(-5, -5));
        assertEquals(-5, NumberCalculator.sum(-5, 0));
        assertEquals(-5, NumberCalculator.sum(0, -5));

        assertEquals(0, NumberCalculator.sum(-5, 5));
    }
}