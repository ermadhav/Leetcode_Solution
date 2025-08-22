class Solution {
    public int minimumArea(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;

        // Initialize bounds for 1's
        int minRow = rows, maxRow = -1;
        int minCol = cols, maxCol = -1;

        // Find min/max row & col containing 1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        // No 1's found
        if (maxRow == -1) return 0;

        // Compute area
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }
}
