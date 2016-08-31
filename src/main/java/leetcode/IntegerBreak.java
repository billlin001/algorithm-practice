package leetcode;

/**
 * https://leetcode.com/problems/integer-break/
 * Created by bill33 on 2016/8/31.
 */
public class IntegerBreak {
    public int integerBreak(int n) {
        int[] ans = new int[n + 1];

        ans[1] = 1;
        ans[2] = 1;

        for (int i = 3; i <= n; i++) {
            int sum = 0;
            for (int left = 1; left < (i/2 + 1); left++) {
                int right = i - left;
                int temp = (ans[left] > left ? ans[left] : left) * (ans[right] > right ? ans[right] : right);
                if(temp > sum) {
                    sum = temp;
                    ans[i] = sum;
                }
            }
        }

        return ans[n];
    }
}
