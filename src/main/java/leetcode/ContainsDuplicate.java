package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/
 * Created by bill33 on 2016/8/31.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>(nums.length * 4);
        for(int item : nums) {
            if(numsSet.contains(item)) return true;
            numsSet.add(item);
        }

        return false;
    }
}
