package leetcode;

/**
 * Created by bill33 on 2016/7/11.
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] results = new int[num + 1];
        if(num == 0) return new int[]{0};
        if(num == 1) return new int[]{0, 1};

        results[0] = 0;
        results[1] = 1;

        int n = 1;

        for(int i = 2; i <= num; i++) {
            if(Math.pow(2, n+1) <= i) n++;
//            System.out.println();
//            System.out.println("i: " + i);
//            System.out.println("n: " + n);
//            System.out.println("pow: " + Math.pow(2, n));
//            System.out.println("result: " + (results[i - (int)Math.pow(2, n)] + 1));

            results[i] = results[i - (int)Math.pow(2, n)] + 1;
        }

        return results;
    }
}

