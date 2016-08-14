package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/7/23.
 */
public class ProductOfArrayExceptSelfTest {

    @Test
    public void whenNumsAre1And2_thenReturn2And1() throws Exception {
        int[] nums = {1, 2};
        ProductOfArrayExceptSelf target = new ProductOfArrayExceptSelf();
        int[] actual = target.productExceptSelf(nums);
        int[] expected = {2, 1};
        assertArrayEquals(expected, actual);
    }

    //For example, given [1,2,3,4], return [24,12,8,6]
    @Test
    public void whenNumsAre_1_2_3_4_thenReturn_24_12_8_6() throws Exception {
        int[] nums = {1, 2, 3, 4};
        ProductOfArrayExceptSelf target = new ProductOfArrayExceptSelf();
        int[] actual = target.productExceptSelf(nums);
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, actual);
    }

}