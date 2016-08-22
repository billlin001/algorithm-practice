package leetcode;

/**
 * url: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 167. Two Sum II - Input array is sorted
 *
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 *
 * Created by bill33 on 2016/8/22.
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] results = new int[2];

        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        while(leftIndex < rightIndex) {
            int sum = numbers[leftIndex] + numbers[rightIndex];
            if(sum == target) {
                results[0] = leftIndex + 1;
                results[1] = rightIndex + 1;
                return results;

            } else if(sum > target) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }

        return results;
    }
}
