class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0; // To store the expected sum from 0 to n
        int sum = 0;       // To store the actual sum of elements in the array
        int n = nums.length; // Length of the array, which is n (since one number is missing from [0..n])

        // Loop through the array
        for (int i = 0; i < n; i++) {
            // Calculate the expected sum of numbers from 0 to n
            actualSum = (n * (n + 1)) / 2;

            // Add each number in the array to get the actual sum
            sum = sum + nums[i];
        }

        // The missing number is the difference between expected sum and actual sum
        return actualSum - sum;
    }
}
