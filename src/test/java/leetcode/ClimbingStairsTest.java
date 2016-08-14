package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/7/22.
 */
public class ClimbingStairsTest {

    @Test
    public void whenNis0_thenReturn0() throws Exception {
        int n = 0;
        ClimbingStairs target = new ClimbingStairs();
        int actual = target.climbStairs(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void whenNis1_thenReturn1() throws Exception {
        int n = 1;
        ClimbingStairs target = new ClimbingStairs();
        int actual = target.climbStairs(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void whenNis2_thenReturn2() throws Exception {
        int n = 2;
        ClimbingStairs target = new ClimbingStairs();
        int actual = target.climbStairs(n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void whenNis3_thenReturn3() throws Exception {
        int n = 3;
        ClimbingStairs target = new ClimbingStairs();
        int actual = target.climbStairs(n);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void whenNis4_thenReturn5() throws Exception {
        int n = 4;
        ClimbingStairs target = new ClimbingStairs();
        int actual = target.climbStairs(n);
        int expected = 5;
        assertEquals(expected, actual);
    }
}