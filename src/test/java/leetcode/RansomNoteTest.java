package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/8/14.
 */
public class RansomNoteTest {

    RansomNote target;

    @Before
    public void setUp() throws Exception {
        target = new RansomNote();
    }

    @Test
    public void given_a_and_b_should_false() throws Exception {
        String ransomNote = "a";
        String maginze = "b";
        boolean actual = target.canConstruct(ransomNote, maginze);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void given_aa_and_ab_should_false() {
        String ransomNote = "aa";
        String maginze = "ab";
        boolean actual = target.canConstruct(ransomNote, maginze);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void given_aa_and_aab_should_true() {
        String ransomNote = "aa";
        String maginze = "aab";
        boolean actual = target.canConstruct(ransomNote, maginze);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}