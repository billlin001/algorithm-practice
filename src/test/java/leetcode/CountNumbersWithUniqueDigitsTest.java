package leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/8/29.
 */
public class CountNumbersWithUniqueDigitsTest {
    CountNumbersWithUniqueDigits target;

    @Before
    public void setUp() throws Exception {
        target = new CountNumbersWithUniqueDigits();
    }

    @Test
    public void testCountNumbersWithUniqueDigits_givenNis0_shouldReturn0() throws Exception {
        int n = 0;
        int actual = target.countNumbersWithUniqueDigits(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNumbersWithUniqueDigits_givenNis1_shouldReturn10() throws Exception {
        int n = 1;
        int actual = target.countNumbersWithUniqueDigits(n);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNumbersWithUniqueDigits_givenNis2_shouldReturn91() throws Exception {
        int n = 2;
        int actual = target.countNumbersWithUniqueDigits(n);
        int expected = 91;
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNumbersWithUniqueDigits_givenNis3_shouldReturn739() throws Exception {
        int n = 3;
        int actual = target.countNumbersWithUniqueDigits(n);
        int expected = 739;
        assertEquals(expected, actual);
    }
}