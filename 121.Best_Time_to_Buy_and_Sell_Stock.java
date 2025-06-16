class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // store the minimum price seen so far
        int maxProfit = 0; // store the maximum profit

        for (int price : prices) {
            if (price < minPrice) {
                // if current price is less than minPrice, update minPrice
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                // if selling at current price gives more profit, update maxProfit
                maxProfit = price - minPrice;
            }
        }

        return maxProfit; // return the highest profit found
    }
}
