class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        // Initialize minA and minB to the full size of the matrix
        int minA = m;
        int minB = n;
        
        // Loop through each operation
        for (int[] op : ops) {
            // Find the intersection of all operation rectangles
            // Update minA and minB to be the smallest a and b respectively
            minA = Math.min(minA, op[0]);
            minB = Math.min(minB, op[1]);
        }
        
        // The area covered by the overlapping region is where the max value resides
        // Return the count of such cells
        return minA * minB;
    }
}
