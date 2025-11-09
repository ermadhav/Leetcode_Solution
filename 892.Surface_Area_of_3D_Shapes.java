class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int area = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int h = grid[i][j];

                // Add surface from this tower
                if (h > 0) {
                    area += 6 * h - 2 * (h - 1); // remove hidden faces inside the tower
                }

                // Remove hidden faces with right neighbor
                if (j + 1 < n) {
                    area -= 2 * Math.min(h, grid[i][j + 1]);
                }

                // Remove hidden faces with bottom neighbor
                if (i + 1 < n) {
                    area -= 2 * Math.min(h, grid[i + 1][j]);
                }
            }
        }

        return area;
    }
}
