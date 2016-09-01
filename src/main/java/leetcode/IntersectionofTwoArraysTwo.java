package leetcode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 *
 * Created by bill33 on 2016/9/1.
 */
public class IntersectionofTwoArraysTwo {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Long> countOfNums1 = Arrays
                    .stream(nums1).boxed().collect(Collectors.toList())
                    .parallelStream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countOfNums1);

        List<Integer> ansList = new ArrayList<>();
        Arrays.stream(nums2).forEach(item -> {
            Long count = countOfNums1.get(item);
            if(count != null && count != 0) {
                ansList.add(item);
                countOfNums1.put(item, count - 1);
            }
        });

        System.out.println(ansList);

        int[] ans = ansList.stream().mapToInt(i->i).toArray();

        return ans;
    }
}
