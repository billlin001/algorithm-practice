package leetcode;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/8/14.
 */
public class ShuffleAnArrayTest {
    int[] nums = {1, 2, 3};
    ShuffleAnArray target;

    @Before
    public void setUp() throws Exception {
        target = new ShuffleAnArray(nums);
    }

    @Test
    public void testRest() throws Exception {
        int[] actuals = target.reset();
        assertArrayEquals(nums, actuals);
    }

    @Test
    public void testShuffle() throws Exception {
        int[] actuals = target.shuffle();
        int[] expected = {2, 3, 1};
        assertArrayEquals(expected, actuals);
    }
}