class Solution {
    public int maximumDifference(int[] prices) {
        int max = -1; // Start with -1 (no valid pair found yet)
        
        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                // If prices[j] is bigger than prices[i] and difference is larger than max
                if(prices[i] < prices[j] && prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i]; // Update max difference
                }
            }
        }
        
        return max; // Return the largest difference found
    }
}
