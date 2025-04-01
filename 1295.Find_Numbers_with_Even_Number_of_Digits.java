class Solution {
    public int findNumbers(int[] nums) {
        int count = 0; // Initialize count to store numbers with even digits
        
        // Loop through each number in the given array
        for (int i = 0; i < nums.length; i++) {
            
            // Calculate the number of digits in the current number
            int digit = (int) Math.floor(Math.log10(Math.abs(nums[i])) + 1);
            
            // Check if the number of digits is even
            if (digit % 2 == 0 && nums.length > 0) {
                count++; // Increment count if the condition is met
            }
        }
        
        return count; // Return the count of numbers with an even number of digits
    }
}
