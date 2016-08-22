package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bill33 on 2016/8/16.
 */
public class BestTimeToBuyAndSellStockIITest {

    @Test
    public void testMaxProfit() throws Exception {
        int[] prices = {1, 2, 3};

        BestTimeToBuyAndSellStockII target = new BestTimeToBuyAndSellStockII();
        int actual = target.maxProfit(prices);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void given_1_4_2_shouldReturn3() {
        int[] prices = {1, 4, 2};

        BestTimeToBuyAndSellStockII target = new BestTimeToBuyAndSellStockII();
        int actual = target.maxProfit(prices);
        int expected = 3;

        assertEquals(expected, actual);
    }
}