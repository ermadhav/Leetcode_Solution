class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0; // To count how many changes are needed
        
        for (int i = 0; i < nums.length - 1; i++) {
            // If current element is greater than the next, it's a violation
            if (nums[i] > nums[i + 1]) {
                count++;
                if (count > 1) return false; // More than one change needed

                // Decide which element to modify
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1]; // Modify current element
                } else {
                    nums[i + 1] = nums[i]; // Modify next element
                }
            }
        }
        
        return true; // At most one modification needed
    }
}
