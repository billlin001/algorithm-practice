package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/7/11.
 */
public class NimGameTest {
    @Test
    public void testsolution1_Input_5_Return_True() throws Exception {
        boolean actual = new NimGame().solution1(5);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testsolution1_Input_7_Return_True() throws Exception {
        boolean actual = new NimGame().solution1(7);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testsolution1_Input_8_Return_False() throws Exception {
        boolean actual = new NimGame().solution1(8);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}