class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;  // current wealth
        int max = 0;  // max wealth

        for(int i = 0; i < accounts.length; i++){
            int[] row = accounts[i];  
            ans = 0;  

            for(int j = 0; j < row.length; j++){
                ans += row[j];  // sum accounts
            }

            max = Math.max(max, ans);  // update max
        }

        return max;  // return max wealth
    }
}
