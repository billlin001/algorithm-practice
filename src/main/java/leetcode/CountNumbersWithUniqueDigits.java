package leetcode;

/**
 * https://leetcode.com/problems/count-numbers-with-unique-digits/
 * Created by bill33 on 2016/8/29.
 */
public class CountNumbersWithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        if(n == 1) return 10;

        int[] ans = new int[n];
        ans[0] = 10;
        ans[1] = 81;
        int result = 91;
        for(int i = 2; i < n; i++) {
            ans[i] = ans[i-1] * (9 - (i + 1) + 2);
            result += ans[i];
        }

        return result;
    }
}
