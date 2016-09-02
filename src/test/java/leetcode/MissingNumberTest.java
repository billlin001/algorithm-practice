package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/9/2.
 */
public class MissingNumberTest {

    @Test
    public void testMissingNumber() throws Exception {
        int[] nums = {0, 1, 3};
        int actual = new MissingNumber().missingNumber(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }
}