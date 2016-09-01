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

        List<Integer> ans = new ArrayList<>();
        for (int item : nums2) {
            Integer count = countOfNums1.get(item);
            if(count != null && count != 0) {
                ans.add(item);
                countOfNums1.put(item, count - 1);
            }
        }

        int[] ansArray = new int[ans.size()];
        int i = 0;
        for (int item : ans) {
            ansArray[i++] = item;
        }

        return ansArray;
    }
}
