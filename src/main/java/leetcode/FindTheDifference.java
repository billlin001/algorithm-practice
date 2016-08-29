package leetcode;

/**
 * https://leetcode.com/problems/find-the-difference/
 *
 * Created by bill33 on 2016/8/29.
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        int[] countOfS = new int[26];
        int codeOfA  = 'a';
        for(char item : s.toCharArray()) {
            int index = item - codeOfA;
            countOfS[index]++;
        }

        for(char item : t.toCharArray()) {
            int index = item - codeOfA;
            if(countOfS[index] == 0) return item;
            countOfS[index]--;
        }

        return '0';
    }

}
