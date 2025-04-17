class Solution {
    // Method to search for a target value in a 2D matrix
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false; // Initialize result variable as false

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each element in the current row (column)
            for (int j = 0; j < matrix[i].length; j++) {
                // Check if the current element matches the target
                if (matrix[i][j] == target) {
                    ans = true; // Target found, set answer to true
                }
            }
        }

        // Return true if target was found, otherwise false
        return ans;
    }
}