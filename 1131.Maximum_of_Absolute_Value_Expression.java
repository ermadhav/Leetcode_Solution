class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n = arr1.length, res = 0;

        // All sign combinations for arr1[i], arr2[i], and i
        int[][] cases = {{1,1,1},{1,1,-1},{1,-1,1},{1,-1,-1}};
        
        for (int[] c : cases) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            
            for (int i = 0; i < n; i++) {
                // Compute expression with current sign case
                int val = c[0]*arr1[i] + c[1]*arr2[i] + c[2]*i;
                min = Math.min(min, val);
                max = Math.max(max, val);
            }
            
            // Update max difference
            res = Math.max(res, max - min);
        }
        return res;
    }
}
