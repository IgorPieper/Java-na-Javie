package pl.pjatk;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void powerOf2to3Equals8(){
        int expected = 8;
        int result = Calculator.power(2,3);
        assertEquals(expected, result);
    }

    @Test
    public void baseOf2RisedTo3(){
        int result = Calculator.power(-411244,4);
        assertTrue(result > 0);
    }

    @Test
    public void is4DividedBy2(){
        boolean result = Calculator.divided(4, 2);
        assertTrue(result);
    }

    @Test
    public void is4DividedBy3(){
        boolean result = Calculator.divided(4, 3);
        assertFalse(result);
    }
}
