package leetcode;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/8/31.
 */
public class IntegerBreakTest {

    @Test
    public void testIntegerBreak_given2_shouldReturn1() throws Exception {
        int n = 2;
        int actual = new IntegerBreak().integerBreak(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testIntegerBreak_given10_shouldReturn36() throws Exception {
        int n = 10;
        int actual = new IntegerBreak().integerBreak(n);
        int expected = 36;
        assertEquals(expected, actual);
    }

    @Test
    public void testIntegerBreak_given58_printAllAnswer() throws Exception {
        int n = 58;
        int actual = new IntegerBreak().integerBreak(n);
//        int expected = 36;
//        assertEquals(expected, actual);
    }
}