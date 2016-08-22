package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/8/22.
 */
public class TwoSumIITest {

    @Test
    public void testTwoSum() throws Exception {
        int[] numbers = {2, 7, 11, 15};
        int sum = 9;

        TwoSumII target = new TwoSumII();
        int[] actuals = target.twoSum(numbers, sum);
        int[] expecteds = {1, 2};

        assertArrayEquals(expecteds, actuals);
    }
}