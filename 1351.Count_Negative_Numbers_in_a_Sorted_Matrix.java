class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0; // Initialize a counter to keep track of negative numbers
        
        // Iterate through each row in the grid
        for(int i = 0; i < grid.length; i++) {
            // Iterate through each element in the current row
            for(int j = 0; j < grid[i].length; j++) {
                // Check if the current element is negative
                if(grid[i][j] < 0) {
                    count++; // Increment the counter if it's negative
                }
            }
        }
        
        // Return the total count of negative numbers
        return count;
    }
}
