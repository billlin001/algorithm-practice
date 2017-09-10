package leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
 *
 * Created by bill33 on 2016/9/8.
 */
public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        int[] orderNums = new int[n * n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                orderNums[i * n + j] = matrix[i][j];
            }
        }

        Arrays.sort(orderNums);

        return orderNums[k - 1];
    }
}
