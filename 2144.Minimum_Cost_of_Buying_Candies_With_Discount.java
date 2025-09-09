class Solution {
    public int minimumCost(int[] cost) {
        // Sort candies in descending order
        Arrays.sort(cost);
        int n = cost.length;
        int total = 0;
        int count = 0;

        // Traverse from most expensive to cheapest
        for (int i = n - 1; i >= 0; i--) {
            count++;
            // Every 3rd candy is free, so skip it
            if (count % 3 != 0) {
                total += cost[i];
            }
        }
        return total;
    }
}