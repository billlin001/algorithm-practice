package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/7/18.
 */
public class SumOfTwoIntegersTest {

    @Test
    public void testGetSum_a_is_0_b_is_0_should_retrun_0() throws Exception {
        int a = 0;
        int b = 0;

        SumOfTwoIntegers target = new SumOfTwoIntegers();
        int actual = target.getSum(a, b);
        int expected = a + b;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetSum_a_is_1_b_is_2_should_retrun_3() throws Exception {
        int a = 1;
        int b = 2;

        SumOfTwoIntegers target = new SumOfTwoIntegers();
        int actual = target.getSum(a, b);
        int expected = a + b;

        assertEquals(expected, actual);
    }
}