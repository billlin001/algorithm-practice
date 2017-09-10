package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/9/8.
 */
public class KthSmallestElementInASortedMatrixTest {

    @Test
    public void testKthSmallest() throws Exception {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 8;

        int actual = new KthSmallestElementInASortedMatrix().kthSmallest(matrix, k);
        int ecpected = 13;

        assertEquals(ecpected, actual);
    }
}