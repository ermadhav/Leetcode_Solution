class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0; // Counter for elements not divisible by 3

        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is not divisible by 3, increment the counter
            if (nums[i] % 3 != 0) {
                ans++;
            }
        }

        // Return the total number of operations needed
        return ans;
    }
}
