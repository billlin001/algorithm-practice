package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/9/1.
 */
public class IntersectionofTwoArraysTwoTest {

    @Test
    public void testIntersect_situation1() throws Exception {
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        int[] actual = new IntersectionofTwoArraysTwo().intersect(num1, num2);
        int[] expected = {2, 2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIntersect_situation2() throws Exception {
        int[] num1 = {1};
        int[] num2 = {1, 1};
        int[] actual = new IntersectionofTwoArraysTwo().intersect(num1, num2);
        int[] expected = {1};
        assertArrayEquals(expected, actual);
    }
}