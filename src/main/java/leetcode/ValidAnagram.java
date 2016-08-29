package leetcode;

import java.util.*;

/**
 * url: https://leetcode.com/problems/valid-anagram/
 *
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 *
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 *
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 *
 * Created by bill33 on 2016/8/23.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] charsOfS = s.toCharArray();
        char[] charsOfT = t.toCharArray();

        Map<Character, Integer> mapCharOfS = new HashMap<>();
        for(char item : charsOfS) {
            Integer num = mapCharOfS.get(item);
            if(num == null) mapCharOfS.put(item, 1);
            else mapCharOfS.put(item, num + 1);
        }

        for (char item : charsOfT) {
            Integer num = mapCharOfS.get(item);
            if(num == null || num == 0) return false;
            else mapCharOfS.put(item, num - 1);
        }

        return true;
    }
}
