class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = 0;

        // Find the first occurrence of target
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                start = i;
                break; // stop once found
            } else {
                start = -1; // if not found, set to -1
            }
        }

        // Find the last occurrence of target
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] == target) {
                end = i;
                break; // stop once found
            } else {
                end = -1; // if not found, set to -1
            }
        }

        // If array is empty, return [-1, -1]
        if(nums.length == 0) {
            start = -1;
            end = -1;
        }

        // Return the result as an array
        int[] ans = {start, end};
        return ans;
    }
}
