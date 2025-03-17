class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: If the array is empty, return 0
        if (nums.length == 0) return 0;
        
        // Pointer to track the position of the next unique element
        int k = 1;

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one, it is unique
            if (nums[i] != nums[i - 1]) {
                // Move the unique element to index k
                nums[k] = nums[i];
                // Increment k to point to the next position for unique elements
                k++;
            }
        }

        // Return the count of unique elements
        return k;
    }
}
