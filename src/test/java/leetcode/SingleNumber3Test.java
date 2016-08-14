package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/7/18.
 */
public class SingleNumber3Test {

    @Test
    public void testSingleNumber() throws Exception {
        int[] intArray = {};

        SingleNumber3 target = new SingleNumber3();
        int[] actual = target.singleNumber(intArray);
        int[] exptected = {};

        assertArrayEquals(exptected, actual);
    }

    @Test
    public void testSingleNumber_Given_1_Should_1() throws Exception {
        int[] intArray = {1};

        SingleNumber3 target = new SingleNumber3();
        int[] actual = target.singleNumber(intArray);
        int[] exptected = {1};

        assertArrayEquals(exptected, actual);
    }

    @Test
    public void testSingleNumber_Given_1_2_Should_1_2() throws Exception {
        int[] intArray = {1, 2};

        SingleNumber3 target = new SingleNumber3();
        int[] actual = target.singleNumber(intArray);
        int[] exptected = {1, 2};

        assertArrayEquals(exptected, actual);
    }

    @Test
    public void testSingleNumber_Given_1_2_1_3_2_5_Should_3_5() throws Exception {
        int[] intArray = {1, 2, 1, 3, 2, 5};

        SingleNumber3 target = new SingleNumber3();
        int[] actual = target.singleNumber(intArray);
        int[] exptected = {3, 5};

        assertArrayEquals(exptected, actual);
    }
}