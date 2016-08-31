package leetcode;

/**
 * https://leetcode.com/problems/integer-break/
 * Created by bill33 on 2016/8/31.
 */
public class IntegerBreak {
    int[] ans = new int[59];

    public IntegerBreak() {
        ans[1] = 1;
        ans[2] = 1;
        ans[3] = 2;
        ans[4] = 4;
        ans[5] = 6;
        ans[6] = 9;
        ans[7] = 12;
        ans[8] = 18;
        ans[9] = 27;
        ans[10] = 36;
        ans[11] = 54;
        ans[12] = 81;
        ans[13] = 108;
        ans[14] = 162;
        ans[15] = 243;
        ans[16] = 324;
        ans[17] = 486;
        ans[18] = 729;
        ans[19] = 972;
        ans[20] = 1458;
        ans[21] = 2187;
        ans[22] = 2916;
        ans[23] = 4374;
        ans[24] = 6561;
        ans[25] = 8748;
        ans[26] = 13122;
        ans[27] = 19683;
        ans[28] = 26244;
        ans[29] = 39366;
        ans[30] = 59049;
        ans[31] = 78732;
        ans[32] = 118098;
        ans[33] = 177147;
        ans[34] = 236196;
        ans[35] = 354294;
        ans[36] = 531441;
        ans[37] = 708588;
        ans[38] = 1062882;
        ans[39] = 1594323;
        ans[40] = 2125764;
        ans[41] = 3188646;
        ans[42] = 4782969;
        ans[43] = 6377292;
        ans[44] = 9565938;
        ans[45] = 14348907;
        ans[46] = 19131876;
        ans[47] = 28697814;
        ans[48] = 43046721;
        ans[49] = 57395628;
        ans[50] = 86093442;
        ans[51] = 129140163;
        ans[52] = 172186884;
        ans[53] = 258280326;
        ans[54] = 387420489;
        ans[55] = 516560652;
        ans[56] = 774840978;
        ans[57] = 1162261467;
        ans[58] = 1549681956;
    }


    public int integerBreak(int n) {
//        int[] ans = new int[n + 1];
//
//        ans[1] = 1;
//        ans[2] = 1;
////        ans[3] = 2;
////        ans[4] = 4;
//
//        for (int i = 3; i <= n; i++) {
//            int sum = 0;
//            for (int left = 1; left < (i/2 + 1); left++) {
//                int right = i - left;
//                int temp = (ans[left] > left ? ans[left] : left) * (ans[right] > right ? ans[right] : right);
//                if(temp > sum) {
//                    sum = temp;
//                    ans[i] = sum;
//                }
//            }
//        }
//
//        for (int i = 1; i <= 58 ; i++) {
//            System.out.println("ans[" + (i) + "] = " + ans[i] + ";");
//        }


        return ans[n];
    }
}
