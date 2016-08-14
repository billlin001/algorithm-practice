package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bill33 on 2016/7/19.
 */
public class IntersectionOfTwoArrays {
    public int[] solution1(int[] nums1, int[] nums2) {
        Set<Integer> numSet1 = new HashSet<Integer>();
        Set<Integer> intersection = new HashSet<Integer>();

        for(int item : nums1)
            numSet1.add(item);

        for(int item : nums2) {
            if(numSet1.contains(item)) {
                intersection.add(item);
            }
        }

        int[] results = new int[intersection.size()];
        int i = 0;
        for(Integer item : intersection) {
            results[i++] = item;
        }

        return results;
    }

    public int[] solution2(int[] nums1, int[] nums2) {


        return null;
    }
}
