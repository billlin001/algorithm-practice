package leetcode;

/**
 * Created by bill33 on 2016/7/22.
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        int[] results = new int[n];

        if(n < 3) return n;
        results[0] = 1;
        results[1] = 2;

        for(int i = 2; i < n; i++) {
            results[i] = results[i-1] + results[i-2];
        }

        return results[n-1];
    }
}
