package leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/roman-to-integer/
 *
 * Created by bill33 on 2016/9/2.
 */
public class RomanToInteger {
    static final char roman1000 = 'M';
    static final char roman500 = 'D';
    static final char roman100 = 'C';
    static final char roman50 = 'L';
    static final char roman10 = 'X';
    static final char roman5 = 'V';
    static final char roman1 = 'I';

    static List<Character> romanSymbalOrder = new ArrayList<>(
            Arrays.asList(new Character[]{roman1000, roman500, roman100, roman50, roman10, roman5, roman1})
    );
    static Map<Character, Integer> valueOfSymbal = new HashMap<>();

    static {
        valueOfSymbal.put(roman1000, 1000);
        valueOfSymbal.put(roman500, 500);
        valueOfSymbal.put(roman100, 100);
        valueOfSymbal.put(roman50, 50);
        valueOfSymbal.put(roman10, 10);
        valueOfSymbal.put(roman5, 5);
        valueOfSymbal.put(roman1, 1);
    }

    public int romanToInt(String s) {
        char[] charsOfS = s.toCharArray();

        int ans = 0;
        int runIndex = 0;

        while(runIndex < s.length()) {
            char nowSymbal = charsOfS[runIndex];
            System.out.println(nowSymbal);
            int nowVal = valueOfSymbal.get(nowSymbal);

            runIndex ++;
            if(runIndex != s.length()) {
                char nextSymbal = charsOfS[runIndex];
                System.out.println(nextSymbal);
                int nextSymbalIndex = romanSymbalOrder.indexOf(nextSymbal);
                int nowSymbalIndex = romanSymbalOrder.indexOf(nowSymbal);

                if(nextSymbalIndex < nowSymbalIndex) {
                    ans += (valueOfSymbal.get(nextSymbal) - nowVal);
                    runIndex++;
                    continue;
                }
            }

            ans += nowVal;
        }

        return ans;
    }
}
