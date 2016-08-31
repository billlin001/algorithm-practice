package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/8/31.
 */
public class ContainsDuplicateTest {

    @Test
    public void testContainsDuplicate_givenDuplicateIntArray_shouldReturnTrue() throws Exception {
        int[] nums = {1, 1};
        boolean actual = new ContainsDuplicate().containsDuplicate(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testContainsDuplicate_givenNotDuplicateIntArray_shouldReturnFalse() throws Exception {
        int[] nums = {1, 2};
        boolean actual = new ContainsDuplicate().containsDuplicate(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}