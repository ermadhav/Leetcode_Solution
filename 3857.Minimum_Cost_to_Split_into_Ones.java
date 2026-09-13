class Solution {
    public int minCost(int n) {
        int[] dp = new int[n+1];
        dp[1] = 0;
        for(int x = 2; x <=n; x++){
            dp[x] = Integer.MAX_VALUE;
            for(int a =1; a<x; a++){
                int b = x-a;
                dp[x] = Math.min(dp[x], a*b+dp[a]+dp[b]);
            }
        }
        return dp[n];
    }
}