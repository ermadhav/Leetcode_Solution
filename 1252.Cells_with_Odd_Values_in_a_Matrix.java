class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        // Arrays to track how many times each row and column was incremented
        int[] row = new int[m];
        int[] col = new int[n];

        // Apply increments: increase count for the row and column
        for (int[] index : indices) {
            row[index[0]]++; // increment row counter
            col[index[1]]++; // increment column counter
        }

        int oddCount = 0; // final result: number of odd-valued cells

        // Traverse each cell and check if its value becomes odd
        // A cell value = row[i] + col[j]
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If sum is odd, increment the odd counter
                if ((row[i] + col[j]) % 2 == 1) {
                    oddCount++;
                }
            }
        }

        return oddCount; // return total odd cells
    }
}