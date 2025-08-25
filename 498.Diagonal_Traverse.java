import java.util.*;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // Edge case: if matrix is empty, return empty array
        if (mat == null || mat.length == 0)
            return new int[0];

        int m = mat.length;      // number of rows
        int n = mat[0].length;   // number of columns

        // Map to group elements by their diagonal index (i + j)
        Map<Integer, List<Integer>> diag = new HashMap<>();

        // Fill the map: each key = (i+j), value = list of elements in that diagonal
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int curr = i + j;
                diag.computeIfAbsent(curr, a -> new ArrayList<>()).add(mat[i][j]);
            }
        }

        // Result array to store the final traversal
        int[] ans = new int[m * n];
        int idx = 0; // pointer for inserting into result array

        // Traverse each diagonal in order
        for (int i = 0; i < m + n - 1; i++) {
            List<Integer> list = diag.get(i);

            // Reverse every alternate diagonal (even index diagonals)
            if (i % 2 == 0) {
                Collections.reverse(list);
            }

            // Add diagonal elements to the result array
            for (int val : list) {
                ans[idx++] = val;
            }
        }

        return ans; // Final diagonal order traversal
    }
}
