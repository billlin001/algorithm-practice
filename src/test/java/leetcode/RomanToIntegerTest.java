package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/9/3.
 */
public class RomanToIntegerTest {

    @Test
    public void testRomanToInt_givenI_shouldReturn1() throws Exception {
        String s = "I";
        int actual = new RomanToInteger().romanToInt(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void givenIV_shouldReturn4() throws Exception {
        String s = "IV";
        int actual = new RomanToInteger().romanToInt(s);
        int expected = 4;
        assertEquals(expected, actual);
    }


    @Test
    public void given_DCXXI_shouldReturn_621() throws Exception {
        String s = "DCXXI";
        int actual = new RomanToInteger().romanToInt(s);
        int expected = 621;
        assertEquals(expected, actual);
    }
}