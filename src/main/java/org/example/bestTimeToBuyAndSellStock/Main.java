package org.example.bestTimeToBuyAndSellStock;

public class Main {

    public int maxProfit(int[] prices) {
        // brute force: for each buy day, check for the profit that can be obtained for every selling day
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {

            for (int j = i + 1; j < prices.length; j++) {

                int buyPrice = prices[i];
                int sellPrice = prices[j];
                int profit = sellPrice - buyPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }

            }
        }
        return maxProfit;
    }

}
