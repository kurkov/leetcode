package easy.best_time_to_buy_and_sell_stock_II_122;

/**
 * @author Aleksey Kurkov. Created on 09.01.20
 * @version 1.0
 * Solution of problem 122
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
 */
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                profit = profit + (prices[i + 1] - prices[i]);
            }
        }

        return profit;
    }
}