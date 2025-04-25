import java.util.Arrays;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        // Create an array to store all x-coordinates
        int[] x = new int[points.length];

        // Extract x-coordinates from the input points
        for (int i = 0; i < points.length; i++) {
            x[i] = points[i][0];
        }

        // Sort the x-coordinates in ascending order
        Arrays.sort(x);

        // Initialize variable to keep track of the maximum width
        int maxWidth = 0;

        // Find the maximum difference between consecutive x-coordinates
        for (int i = 1; i < x.length; i++) {
            maxWidth = Math.max(maxWidth, x[i] - x[i - 1]);
        }
        
        // Return the maximum width of vertical area with no points inside
        return maxWidth;
    }
}
