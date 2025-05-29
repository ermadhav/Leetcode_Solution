class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0]; // Start with the first number

        // Each element is the sum of all previous ones including current
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }

        return ans;
    }
}
