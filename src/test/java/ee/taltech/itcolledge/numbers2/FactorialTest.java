package ee.taltech.itcolledge.numbers2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorial() {
        assertEquals(2, Factorial.factorial(2));
        assertEquals(2432902008176640000L, Factorial.factorial(20));
    }
}