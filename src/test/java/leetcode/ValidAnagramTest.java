package leetcode;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/8/23.
 */
public class ValidAnagramTest {
    ValidAnagram target;

    @Before
    public void setUp() throws Exception {
        target = new ValidAnagram();
    }

    @Test
    public void given_s_is_anagram_and_t_is_nagaram_should_return_true() throws Exception {
        String s = "anagram";
        String t = "nagaram";
        boolean actual = target.isAnagram(s, t);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void given_s_is_rat_and_t_is_car_should_return_false() throws Exception {
        String s = "rat";
        String t = "car";
        boolean actual = target.isAnagram(s, t);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}