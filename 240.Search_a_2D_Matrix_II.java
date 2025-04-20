class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false; // Initialize a boolean variable to store the result

        // Loop through each row in the matrix
        for(int i = 0; i < matrix.length; i++) {
            // Loop through each element in the current row
            for(int j = 0; j < matrix[i].length; j++) {
                // Check if the current element is equal to the target
                if(matrix[i][j] == target) {
                    ans = true; // Set ans to true if target is found
                }
            }
        }

        // Return whether the target was found in the matrix
        return ans;
    }
}
