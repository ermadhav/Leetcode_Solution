class Solution {
    public void rotate(int[] nums, int k) {
        // Handle cases where k >= nums.length
        k %= nums.length;  
        
        // Step 1: Reverse the whole array
        reverse(nums, 0, nums.length - 1);
        
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // Step 3: Reverse the rest (from k to end)
        reverse(nums, k, nums.length - 1);
    }

    // Helper method to reverse a portion of the array in place
    void reverse(int[] a, int l, int r) {
        for (; l < r; l++, r--) {
            int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
        }
    }
}
