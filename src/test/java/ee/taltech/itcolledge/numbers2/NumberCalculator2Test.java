package ee.taltech.itcolledge.numbers2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCalculator2Test {

    @Test
    public void sum_is_a_sum_of_3_numbers() {
        assertEquals(0, NumberCalculator2.sum(0, 0, 0));
        assertEquals(10, NumberCalculator2.sum(10, 0, 0));
        assertEquals(10, NumberCalculator2.sum(0, 10, 0));
        assertEquals(10, NumberCalculator2.sum(0, 0, 10));
        assertEquals(30, NumberCalculator2.sum(10, 10, 10));
    }

    @Test
    public void sum_is_a_sum_of_4_numbers() {
        assertEquals(0, NumberCalculator2.sum(0, 0, 0, 0));
        assertEquals(10, NumberCalculator2.sum(10, 0, 0, 0));
        assertEquals(10, NumberCalculator2.sum(0, 10, 0, 0));
        assertEquals(10, NumberCalculator2.sum(0, 0, 10, 0));
        assertEquals(10, NumberCalculator2.sum(0, 0, 0, 10));
        assertEquals(40, NumberCalculator2.sum(10, 10, 10, 10));
    }

    @Test
    public void sum_is_a_sum_of_many_numbers() {
        //uncomment code (it does not compile)
        // to fix compilation head to NumberCalculator2
        assertEquals(0, NumberCalculator2.sum(0, 0, 0, 0, 0, 0, 0, 0));
        assertEquals(10, NumberCalculator2.sum(10, 0, 0, 0, 0, 0, 0, 0));
        assertEquals(10, NumberCalculator2.sum(0, 10, 0, 0, 0, 0, 0, 0));
        assertEquals(10, NumberCalculator2.sum(0, 0, 10, 0, 0, 0, 0, 0));

        //now uncomment even longer code
        assertEquals(10, NumberCalculator2.sum(0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        //add more tests
        assertEquals(10, NumberCalculator2.sum(0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        assertEquals(-10, NumberCalculator2.sum(0, 0, 0, 0, 0, 0, 0, 0, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
    }
}
