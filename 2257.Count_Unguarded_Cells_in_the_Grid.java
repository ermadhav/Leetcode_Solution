class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n]; // 0 = empty, 1 = guard, 2 = wall
        
        // Mark guards on the grid
        for (int[] g : guards) grid[g[0]][g[1]] = 1;
        
        // Mark walls on the grid
        for (int[] w : walls) grid[w[0]][w[1]] = 2;
        
        boolean[][] guarded = new boolean[m][n]; // Tracks guarded cells
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}}; // Up, right, down, left
        
        // For each guard, mark all cells it can guard in four directions
        for (int[] g : guards) {
            for (int[] dir : directions) {
                int r = g[0] + dir[0];
                int c = g[1] + dir[1];
                // Continue marking until hitting another guard or a wall
                while (r >= 0 && r < m && c >= 0 && c < n && grid[r][c] != 1 && grid[r][c] != 2) {
                    guarded[r][c] = true;
                    r += dir[0];
                    c += dir[1];
                }
            }
        }
        
        int count = 0; // Count unguarded empty cells
        
        // Count cells that are empty and not guarded
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0 && !guarded[i][j]) count++;
            }
        }
        
        return count;
    }
}
