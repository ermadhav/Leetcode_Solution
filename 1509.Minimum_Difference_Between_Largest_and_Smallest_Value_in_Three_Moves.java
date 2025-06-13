import java.util.Arrays;

class Solution {
    public int minDifference(int[] nums) {
         int n = nums.length;
        if (n <= 4) {
            return 0;  // Can change all elements to be equal
        }
        
        Arrays.sort(nums);
        
        // Check the 4 possible ways after changing up to 3 elements
        return Math.min(
            Math.min(nums[n - 4] - nums[0], nums[n - 3] - nums[1]),
            Math.min(nums[n - 2] - nums[2], nums[n - 1] - nums[3])
        );
    }
}