class Solution {
    public int averageValue(int[] nums) {
        int count = 0; // To count the number of elements divisible by both 2 and 3
        int ans = 0;   // To store the sum of elements divisible by both 2 and 3

        // Loop through each element in the array
        for(int i = 0; i < nums.length; i++) {
            // Check if the current number is divisible by both 2 and 3
            if(nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                ans += nums[i]; // Add the number to the sum
                count++;        // Increment the count
            }
        }

        // If there are such numbers, calculate the average
        if(count != 0) {
            ans = ans / count; // Integer division to get average
        }

        return ans; // Return the final average or 0 if no valid elements found
    }
}
