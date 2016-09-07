package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/9/7.
 */
public class MajorityElementTest {

    @Test
    public void testMajorityElement_given_1_1_2_shouldReturn1() throws Exception {
        int[] nums = {1, 1, 2};
        int actual = new MajorityElement().majorityElement(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }
}