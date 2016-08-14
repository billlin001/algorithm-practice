package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bill33 on 2016/7/18.
 */
public class SingleNumber3 {
    public int[] singleNumber(int[] nums) {
        Set<Integer> answerSet = new HashSet();
        Set<Integer> twiceSet = new HashSet();

        for(int item : nums) {
            if(twiceSet.contains(item)) continue;
            else if(answerSet.contains(item)) {
                answerSet.remove(item);
                twiceSet.add(item);
            } else answerSet.add(item);

        }

        final int[] results = new int[answerSet.size()];
        int i = 0;
        for(Integer item : answerSet) {
            results[i++] = item.intValue();
        }

        return results;
    }
}
