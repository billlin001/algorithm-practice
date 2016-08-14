package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/7/11.
 */
public class CountingBitsTest {

    @Test
    public void testCountBits_InputZero_Return_0() throws Exception {
        int input = 0;
        int[] actuals = new CountingBits().countBits(input);
        int[] expected = {0};
        assertArrayEquals(expected, actuals);
    }

    @Test
    public void testCountBits_Input_1_Return_0_1() throws Exception {
        int input = 1;
        int[] actuals = new CountingBits().countBits(input);
        int[] expected = {0, 1};
        assertArrayEquals(expected, actuals);
    }

    @Test
    public void testCountBits_Input_2_Return_0_1_1() throws Exception {
        int input = 2;
        int[] actuals = new CountingBits().countBits(input);
        int[] expected = {0, 1, 1};
        assertArrayEquals(expected, actuals);
    }

    @Test
    public void testCountBits_Input_5_Return_0_1_1_2_1_2() throws Exception {
        int input = 5;
        int[] actuals = new CountingBits().countBits(input);
        int[] expected = {0, 1, 1, 2, 1, 2};
        assertArrayEquals(expected, actuals);
    }

    @Test
    public void testCountBits_Input_64_Return_NoError() throws Exception {
        int input = 64;
        int[] actuals = new CountingBits().countBits(input);
//        int[] expected = {0, 1, 1, 2, 1, 2};
        assertEquals(65, actuals.length);
    }
}