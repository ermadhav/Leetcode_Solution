class Solution {
    public int maxProductDifference(int[] nums) {
        // Sort the array using selection sort
        for (int i = 0; i < nums.length - 1; i++) {
            int smallest = i; // Assume the current index holds the smallest value
            for (int j = i + 1; j < nums.length; j++) {
                // Find the smallest value in the remaining array
                if (nums[smallest] > nums[j]) {
                    smallest = j;
                }
            }
            // Swap the smallest value found with the value at the current index
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
        }

        // After sorting, the smallest values are at the start and the largest at the end
        int l = nums.length;
        
        // Calculate the maximum product difference
        // (product of two largest numbers - product of two smallest numbers)
        int ans = Math.abs((nums[0] * nums[1]) - (nums[l - 1] * nums[l - 2]));
        return ans;
    }
}
