import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums); // Sort array in ascending order
        // Check triplets from the largest end
        for (int i = nums.length - 1; i >= 2; i--) {
            // If two smaller sides sum is greater than largest side, valid triangle
            if (nums[i - 1] + nums[i - 2] > nums[i])
                return nums[i] + nums[i - 1] + nums[i - 2]; // Return perimeter
        }
        return 0; // No valid triangle found
    }
}
