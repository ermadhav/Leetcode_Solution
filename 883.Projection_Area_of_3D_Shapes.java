class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int area = 0;

        for (int i = 0; i < n; i++) {
            int maxRow = 0, maxCol = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) area++;          // top view: count visible cells
                maxRow = Math.max(maxRow, grid[i][j]); // front view: tallest in row
                maxCol = Math.max(maxCol, grid[j][i]); // side view: tallest in column
            }
            area += maxRow + maxCol; // add front and side view areas
        }
        return area; // total projection area
    }
}
