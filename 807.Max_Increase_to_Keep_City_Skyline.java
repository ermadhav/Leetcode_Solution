class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int ans = 0;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];

        // maximum height of each row and column are here
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }

        //  maximum height for every row and column find karo
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int maxH = Math.min(rowMax[i], colMax[j]);
                ans += maxH - grid[i][j];
            }
        }
        
        return ans;
    }
}