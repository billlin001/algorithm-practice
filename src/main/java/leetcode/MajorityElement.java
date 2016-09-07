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
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int item : nums) {
            Integer count = numsMap.get(item);
            if(count == null) numsMap.put(item, 1);
            else numsMap.put(item, count + 1);
        }

        int threshold = nums.length / 2;
        for(Map.Entry<Integer, Integer> item : numsMap.entrySet()) {
            Integer count = item.getValue();
            if(count > threshold) return item.getKey();
        }

        return 0;
    }
}
