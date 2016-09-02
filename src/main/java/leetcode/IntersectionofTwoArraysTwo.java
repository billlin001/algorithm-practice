package leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 *
 * Created by bill33 on 2016/9/1.
 */
public class IntersectionofTwoArraysTwo {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countOfNums1 = new HashMap<>();
        for(int item : nums1) {
            Integer count = countOfNums1.get(item);
            if(count== null) countOfNums1.put(item, 1);
            else countOfNums1.put(item, count + 1);
        }

        int[] ans = new int[nums1.length > nums2.length ? nums1.length : nums2.length];
        int index = 0;
        for (int item : nums2) {
            Integer count = countOfNums1.get(item);
            if(count != null && count != 0) {
                ans[index++] = item;
                countOfNums1.put(item, count - 1);
            }
        }

        return Arrays.copyOfRange(ans, 0, index);
    }
}
