package leetcode;

import java.util.Arrays;

/**
 * @link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
 * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 *
 * Created by bill33 on 2016/8/15.
 */
public class BestTimeToBuyAndSellStockII {

    /**
     * greedy solution
     * result: Time Limit Exceeded
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;

        int[] solution = new int[prices.length];
        solution[0] = 0;
        int minPoint = 0;
        int maxPoint = 0;

        for (int i = 1; i < solution.length; i++) {
            if(prices[i] == prices[i-1]) {
                solution[i] = solution[i-1];
                continue;
            }
            else if(prices[i] > prices[i-1]) maxPoint = i;
            else minPoint = i;

            if(maxPoint > minPoint)
                solution[i] = prices[maxPoint] - prices[minPoint] + (minPoint == 0 ? 0 : solution[minPoint - 1]);
            else solution[i] = solution[i - 1];
        }

        return solution[solution.length - 1];
    }
    /**
     * smart solution
     */
    public int maxProfit_smart(int[] prices) {
        int total = 0;

        for (int i=1; i< prices.length-1; i++) {
            if (prices[i]>prices[i-1]) total += prices[i]-prices[i-1];
        }

        return total;
    }


    /**
     * trivial solution
     * result: Time Limit Exceeded
     *
     * @param prices
     * @return
     */
    public int maxProfit_trivial(int[] prices) {
        if(prices.length == 0) return 0;

        int[] solution = new int[prices.length];
        solution[0] = 0;

        for(int i = 1; i<solution.length; i++) {
            int maxProfit = solution[i-1];
            solution[i] = solution[i-1];
            for(int j = i-1; j >= 0; j--) {
                int profit = prices[i] - prices[j];
                int totalProfit = j==0 ? profit : profit + solution[j-1];

                if(totalProfit > maxProfit) {
                    solution[i] = totalProfit;
                    maxProfit = totalProfit;
                }
            }
        }

        return solution[solution.length - 1];
    }
}
