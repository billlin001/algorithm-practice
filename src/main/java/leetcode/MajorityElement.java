package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/
 *
 * Created by bill33 on 2016/9/7.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(count == 0) {
                majority = nums[i];
            } else if(nums[i] == majority) {
                count++;
            } else count--;
        }

        return majority;
    }
}
