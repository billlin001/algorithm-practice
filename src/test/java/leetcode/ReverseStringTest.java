package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/7/2.
 */
public class ReverseStringTest {

    ReverseString target = new ReverseString();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void revert_hello_to_olleh() throws Exception {
        String str = "hello";
        String actual = target.solution1(str);
        String expected = "olleh";
        assertEquals(expected, actual);
    }

    @Test
    public void revert_helloo_to_oolleh() throws Exception {
        String str = "helloo";
        String actual = target.solution1(str);
        String expected = "oolleh";
        assertEquals(expected, actual);
    }

    @Test
    public void revertEmptyString() throws Exception {
        String str = "";
        String actual = target.solution1(str);
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    public void revert_PointA_to_APoint() throws Exception {
        String str = ".a";
        String actual = target.solution1(str);
        String expected = "a.";
        assertEquals(expected, actual);
    }
}