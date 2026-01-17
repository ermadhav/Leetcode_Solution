class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;        // number of rows
        int n = grid[0].length;     // number of columns

        for (int i = 0; i < m; i++) {        // loop through rows
            for (int j = 0; j < n; j++) {    // loop through columns

                // check if value is same as the one below
                if (i + 1 < m && grid[i][j] != grid[i + 1][j]) {
                    return false;
                }

                // check if value is different from the one on the right
                if (j + 1 < n && grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }
        return true;   // all conditions satisfied
    }
}
