class Solution {
    public int triangleNumber(int[] nums) {
        // Sort the array so we can use two-pointer technique
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        // Fix the largest side of the triangle at index k
        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;

            // Use two pointers (i and j) to find valid pairs
            while (i < j) {
                // If nums[i] + nums[j] > nums[k], 
                // then all elements from i to j-1 with nums[j] will also form valid triangles
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i);  // Add all possible pairs
                    j--;               // Move j left to check other combinations
                } else {
                    i++;               // Otherwise, increase i to make sum larger
                }
            }
        }

        // Return the total number of valid triangles
        return count;
    }
}
