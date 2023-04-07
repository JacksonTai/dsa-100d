package org.example.array.bestTimeToBuyAndSellStock;

public class Main {

    public int maxProfit(int[] prices) {
        // Improved solution: Sliding Window
        int maxProfit = 0;
        int buyingDay = 0;
        int sellingDay = 1;

        while (sellingDay < prices.length) {
            if (prices[buyingDay] < prices[sellingDay]) {
                int profit = prices[sellingDay] - prices[buyingDay];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyingDay = sellingDay;
            }
            sellingDay += 1;
        }
        return maxProfit;
    }

}
