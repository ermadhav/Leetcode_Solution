class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        // Add all numbers in the array
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        // Get the remainder when sum is divided by k
        int remainder = sum % k;
        // If sum is smaller than k, return the sum
        if(sum < k) {
            return sum;
        }
        // Else return the remainder
        return remainder;
    }
}
