package leetcode;

/**
 * https://leetcode.com/problems/integer-break/
 * Created by bill33 on 2016/8/31.
 */
public class IntegerBreak {

    public int integerBreak(int n) {
        int[] ans = new int[n + 1];

        if(n == 2) return 1;
        if(n == 3) return 2;

        ans[1] = 1;
        ans[2] = 2;
        ans[3] = 3;
        ans[4] = 4;

        for (int i = 5; i <= n; i++) {
            int sum = 0;
            for (int left = 1; left < (i/2 + 1); left++) {
                int right = i - left;
                int temp = ans[left] * ans[right];
                if(temp > sum) {
                    sum = temp;
                    ans[i] = sum;
                }
            }
        }

        return ans[n];
    }
}
