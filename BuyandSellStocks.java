// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

package EASY;

public class BestTImeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for(int price : prices){
            min = Math.min(min,price);
            max = Math.max(max,price - min);
        }
        return max;
     }
}
