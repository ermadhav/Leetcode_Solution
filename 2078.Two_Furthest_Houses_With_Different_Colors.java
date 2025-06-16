class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;  // stores the maximum distance found so far
        int ans = 0;  // stores the answer (maximum distance)
        
        // Iterate over each pair (i, j) where j > i
        for (int i = 0; i < colors.length - 1; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                // Check if colors at i and j are different and distance is greater than max
                if (colors[i] != colors[j] && (j - i) > max) {
                    max = j - i;  // update max distance
                    ans = max;    // update answer
                }
            }
        }
        
        return ans;  // return the maximum distance found
    }
}
