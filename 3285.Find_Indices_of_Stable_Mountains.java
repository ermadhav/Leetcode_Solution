import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        // Create a list to store the result
        List<Integer> result = new ArrayList<>();
        
        // Loop through the array starting from index 1
        for (int i = 1; i < height.length; i++) {
            // Check if the previous height is greater than the threshold
            if (height[i - 1] > threshold) {
                // Add the current index to the result list
                result.add(i);
            }
        }

        // Return the final result list
        return result;
    }
}
