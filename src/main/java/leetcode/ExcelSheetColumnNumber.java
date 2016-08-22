package leetcode;

/**
 * url: https://leetcode.com/problems/excel-sheet-column-number/
 *
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * Created by bill33 on 2016/8/22.
 */
public class ExcelSheetColumnNumber {
    private static int bigANum = 'A';

    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();

        int[] charNums = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charNums[i] = chars[i] - bigANum + 1;
        }

        int result = 0;
        for (int item : charNums) {
            result *= 26;
            result += item;
        }

        return result;
    }

    public static void main(String[] args) {
        int a = 'A';
        System.out.println(a);
    }
}
