package leetcode;

/**
 *
 * Created by bill33 on 2016/7/2.
 */

/**
 *
 *Write a function that takes a string as input and returns the string reversed.
 *
 *Example:
 *Given s = "hello", return "olleh".
 *
 *Subscribe to see which companies asked this question
 */
public class ReverseString {
    public String solution1(String s) {
        if(s.length()==0) return s;

        char[] sourceAndResult = s.toCharArray();
        int lastPosition = sourceAndResult.length-1;
        int halfPosition = sourceAndResult.length / 2;

        System.out.println(lastPosition);
        System.out.println(halfPosition);

        for(int i=0; i<halfPosition; i++) {
            char temp = sourceAndResult[i];
            sourceAndResult[i] = sourceAndResult[lastPosition-i];
            sourceAndResult[lastPosition-i] = temp;
        }

        return new String(sourceAndResult);
    }
}
