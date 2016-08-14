package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by bill33 on 2016/7/23.
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];

        right[len - 1] = nums[len - 1];
        for(int i = len - 2; i > 0; i--) right[i] = right[i + 1] * nums[i];

        for(int i = 1; i < len - 1; i++) nums[i] = nums[i - 1] * nums[i];;

        nums[len - 1] = nums[len - 2];
        for(int i = 1; i < len - 1; i++) {
            nums[i] = nums[i - 1] * right[i + 1];
        }
        nums[0] = right[1];

        return nums;
    }

    public int[] solution1(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];

        left[0] = nums[0];
        for(int i = 1; i < len - 1; i++) left[i] = left[i - 1] * nums[i];;

        right[len - 1] = nums[len - 1];
        for(int i = len - 2; i > 0; i--) right[i] = right[i + 1] * nums[i];

        nums[0] = right[1];
        nums[len - 1] = left[len - 2];
        for(int i = 1; i < len - 1; i++) {
            nums[i] = left[i - 1] * right[i + 1];
        }

        return nums;
    }
}
