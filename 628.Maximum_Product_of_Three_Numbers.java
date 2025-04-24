import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        int l = nums.length;
        
        // Two possible products:
        // 1. Product of the three largest numbers
        int product1 = nums[l-1] * nums[l-2] * nums[l-3];
        
        // 2. Product of the two smallest numbers (most negative) and the largest number
        int product2 = nums[0] * nums[1] * nums[l-1];
        
        // Return the maximum of the two
        return Math.max(product1, product2);
    }
}
