package leetcode;

/**
 * https://leetcode.com/problems/missing-number/
 *
 * Created by bill33 on 2016/9/2.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0] == 0 ? 1 : 0;

        int ans = 0;
        int left = 0;
        int right = nums.length;
        int mid =  (right - left) / 2;

        while(left != right) {
            if(nums[mid] != mid) { // drop right
                ans = mid;
                right = mid;
                mid = (right - left) / 2;

            } else { // drop left
                left = mid + 1;
                mid = left + (right - left) / 2;
                ans = right;
            }
        }

        return ans;
    }
}

