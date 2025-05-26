class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;  // Get the size of the original n x n matrix

        // Create the result matrix of size (n-2) x (n-2)
        int[][] maxLocal = new int[n - 2][n - 2];

        // Loop over the starting point of each 3x3 subgrid
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int max = Integer.MIN_VALUE;  // Start with the smallest possible value

                // Loop over the 3x3 area starting at (i, j)
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        // Update max with the largest value in this 3x3 subgrid
                        max = Math.max(max, grid[x][y]);
                    }
                }

                // Store the maximum value found in the 3x3 subgrid into the result matrix
                maxLocal[i][j] = max;
            }
        }

        return maxLocal;  // Return the final matrix
    }
}
