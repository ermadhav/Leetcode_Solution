class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        // Calculate total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        // Traverse the array to find pivot index
        for (int i = 0; i < nums.length; i++) {
            // Right sum = total sum - left sum - current element
            int rightSum = totalSum - leftSum - nums[i];

            // Check if left and right sums are equal
            if (leftSum == rightSum) {
                return i; // Pivot index found
            }

            // Update left sum for next iteration
            leftSum += nums[i];
        }

        return -1; // No pivot index found
    }
}