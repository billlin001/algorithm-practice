package leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Shuffle a set of numbers without duplicates.
 *
 * // Init an array with set 1, 2, and 3.
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 *
 * // Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
 * solution.shuffle();
 *
 * // Resets the array back to its original configuration [1,2,3].
 * solution.reset();
 *
 * // Returns the random shuffling of array [1,2,3].
 * solution.shuffle();
 *
 * @url https://leetcode.com/problems/shuffle-an-array/
 * Created by bill33 on 2016/8/14.
 */
public class ShuffleAnArray {
    int[] nums;
    Random random;

    public ShuffleAnArray(int[] nums) {
        this.nums = nums.clone();
        random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null) return null;
        int[] results = nums.clone();
        for(int i = 0; i < nums.length; i++) {
            int j = random.nextInt(nums.length);
            swap(results, i, j);
        }
        return results;
    }

    private void swap(int[] tempAry, int i, int j) {
        int temp = tempAry[i];
        tempAry[i] = tempAry[j];
        tempAry[j] = temp;
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */