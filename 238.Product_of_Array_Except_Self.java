class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multiplication = 1;
        int zeroCount = 0;

        // First pass: calculate total product of non-zero elements and count zeros
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                multiplication *= num;
            }
        }

        int[] ans = new int[nums.length];

        // Second pass: build result based on zero count
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                // More than one zero → all products will be 0
                ans[i] = 0;
            } else if (zeroCount == 1) {
                // One zero → only the index with zero gets the product, rest are 0
                ans[i] = (nums[i] == 0) ? multiplication : 0;
            } else {
                // No zeros → safe to divide
                ans[i] = multiplication / nums[i];
            }
        }

        return ans;
    }
}
