package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/8/31.
 */
public class FirstUniqueCharacterinaStringTest {

    @Test
    public void testFirstUniqChar_given_leetcode_return_0() throws Exception {
        String s = "leetcode";
        int actual = new FirstUniqueCharacterinaString().firstUniqChar(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstUniqChar_given_loveleetcode_return_2() throws Exception {
        String s = "loveleetcode";
        int actual = new FirstUniqueCharacterinaString().firstUniqChar(s);
        int expected = 2;
        assertEquals(expected, actual);
    }
}