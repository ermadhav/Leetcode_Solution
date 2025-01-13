class Solution {
    public int minDeletionSize(String[] strs) {
        int numRows = strs.length;
        int numCols = strs[0].length();

        // Initialize a counter for the number of columns to delete
        int deleteCount = 0;

        // Iterate over each column
        for (int col = 0; col < numCols; col++) {
            // Check if the current column is sorted
            for (int row = 1; row < numRows; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    // Column is not sorted, increment delete count and break
                    deleteCount++;
                    break;
                }
            }
        }

        // Return the total number of columns to delete
        return deleteCount;
    }
}