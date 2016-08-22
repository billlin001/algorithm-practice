package leetcode;

import org.junit.Test;

import java.lang.annotation.Target;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/8/22.
 */
public class ExcelSheetColumnNumberTest {

    @Test
    public void givenA_shouldReturn1() throws Exception {
        String s = "A";

        ExcelSheetColumnNumber target = new ExcelSheetColumnNumber();
        int actual = target.titleToNumber(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void givenZ_shouldReturn26() throws Exception {
        String s = "Z";

        ExcelSheetColumnNumber target = new ExcelSheetColumnNumber();
        int actual = target.titleToNumber(s);
        int expected = 26;
        assertEquals(expected, actual);
    }

    @Test
    public void givenAA_shouldReturn27() throws Exception {
        String s = "AA";

        ExcelSheetColumnNumber target = new ExcelSheetColumnNumber();
        int actual = target.titleToNumber(s);
        int expected = 27;
        assertEquals(expected, actual);
    }
}