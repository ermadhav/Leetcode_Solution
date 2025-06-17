class Solution {
    // Builds array where ans[i] = nums[nums[i]]
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length]; // Result array

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]]; // Assign value based on index mapping
        }

        return ans; // Return the result
    }
}
