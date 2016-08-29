package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bill33 on 2016/8/29.
 */
public class FindTheDifferenceTest {

    @Test
    public void testFindTheDifference() throws Exception {
        String s = "abcd";
        String t = "abcde";

        FindTheDifference target = new FindTheDifference();
        char actual = target.findTheDifference(s, t);
        char expected = 'e';
        assertEquals(expected, actual);
    }
}