package ee.taltech.itcolledge.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbsoluteNumberCalculatorTest {

    @Test
    public void absolute_number_calculator_takes_the_sum_of_absolute_numbers() {
        assertEquals(10, AbsoluteNumberCalculator.sum(5, -5));
        assertEquals(10, AbsoluteNumberCalculator.sum(-5, 5));
        assertEquals(10, AbsoluteNumberCalculator.sum(-5, -5));

        assertEquals(0, NumberCalculator.sum(0, 0));
        assertEquals(5, NumberCalculator.sum(5, 0));
        assertEquals(5, NumberCalculator.sum(0, 5));
        assertEquals(10, NumberCalculator.sum(5, 5));
    }
}