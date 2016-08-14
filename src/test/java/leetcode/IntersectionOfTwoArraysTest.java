package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/7/19.
 */
public class IntersectionOfTwoArraysTest {

    @Test
    public void testSolution1_EmptyArray() throws Exception {
        int[] a = {};
        int[] b = {};

        IntersectionOfTwoArrays target = new IntersectionOfTwoArrays();
        int[] actuals = target.solution1(a, b);
        int[] expects = {};

        assertArrayEquals(expects, actuals);
    }

    @Test
    public void testSolution1_A_1_2_2_1_B_2_2_Shouble_2() throws Exception {
        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};

        IntersectionOfTwoArrays target = new IntersectionOfTwoArrays();
        int[] actuals = target.solution1(a, b);
        int[] expects = {2};

        assertArrayEquals(expects, actuals);
    }
}