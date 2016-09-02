package leetcode;

/**
 * https://leetcode.com/problems/missing-number/
 *
 * Created by bill33 on 2016/9/2.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum1 = (1 + nums.length) * nums.length / 2;
        int sum2 = 0;
        for(int item : nums) {
            sum2+=item;
        }
        return sum1 - sum2;
    }
}

