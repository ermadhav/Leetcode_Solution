class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;

        // Array to count occurrences of each number from 1 to n^2
        int[] count = new int[size + 1];

        // Count how many times each number appears in the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                count[grid[i][j]]++; // Increment count of the number at grid[i][j]
            }
        }

        int repeated = -1, missing = -1;

        // Check which number is repeated and which is missing
        for (int i = 1; i <= size; i++) {
            if (count[i] == 2) repeated = i;   // Found the number that appears twice
            else if (count[i] == 0) missing = i; // Found the number that is missing
        }

        // Return result as [repeated, missing]
        return new int[]{repeated, missing};
    }
}
