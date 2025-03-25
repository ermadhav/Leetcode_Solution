class Solution {
    public boolean isMonotonic(int[] nums) {

        boolean increasing = true;  // Track if array is increasing
        boolean decreasing = true;  // Track if array is decreasing

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]) {  
                decreasing = false;  // If next number is greater, not decreasing
            } else if(nums[i] > nums[i + 1]) {  
                increasing = false;  // If next number is smaller, not increasing
            }
        }
        return increasing || decreasing;  // If either is true, array is monotonic
    }
}
