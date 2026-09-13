class Solution {
    public int minCost(int n) {
        // stores the min cost 
        int[] dp = new int[n+1];
        dp[1] = 0;

        // find ans from 2 to n
        for(int x = 2; x <=n; x++){

            // setting a very large no. initially
            dp[x] = Integer.MAX_VALUE;

            // trying all possible splits
            for(int a =1; a<x; a++){

                int b = x-a;

                // costing of spitting + cost of split of both part
                dp[x] = Math.min(dp[x], a*b+dp[a]+dp[b]);
            }
        }
        return dp[n];
    }
}