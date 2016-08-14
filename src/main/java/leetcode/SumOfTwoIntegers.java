package leetcode;

/**
 * Created by bill33 on 2016/7/18.
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        char[] bitArrayOfA = Integer.toBinaryString(a).toCharArray();
        char[] bitArrayOfB = Integer.toBinaryString(b).toCharArray();
        char[] result = new char[bitArrayOfA.length];
        int carry = 0;

        for(int i = 0; i < bitArrayOfA.length; i++) {
            if(bitArrayOfA[i] == '1') {
                if(bitArrayOfB[i] == '1') {
                    if(carry == 0) result[i] = 0;
                    else result[i] = 1;
                    carry = 1;
                }
                else {
                    if(carry == 0) {
                        result[i] = 1;
                        carry = 0;
                    }
                    else {
                        result[i] = 0;
                        carry = 1;
                    }

                }


            }
//            else if()


        }

        return a & b;
    }

}
