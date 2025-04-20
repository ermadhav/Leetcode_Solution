class Solution {
    public int search(int[] nums, int target) {
        int ans = 0; // Initialize answer variable
        
        // Loop through the array to find the target
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                ans = i; // If target found, store the index
                break;   // Exit the loop as target is found
            } else {
                ans = -1; // If target not found yet, keep answer as -1
            }
        }

        return ans; // Return the index of target or -1 if not found
    }
}
