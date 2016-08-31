package leetcode;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * Created by bill33 on 2016/8/31.
 */
public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        int code_of_a = 'a';
        int[] wordCount = new int[26];
        char[] charsOfS = s.toCharArray();

        for(char item : charsOfS) {
            wordCount[item - code_of_a]++;
        }

        for (int i = 0; i < charsOfS.length; i++) {
            if(wordCount[charsOfS[i] - code_of_a] == 1) return i;
        }

        return -1;
    }
}
