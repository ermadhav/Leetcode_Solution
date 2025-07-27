class Solution {
    public int countPartitions(int[] nums) {
        int total = 0, left = 0, count = 0;
        for (int num : nums) total += num;
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            if ((2 * left - total) % 2 == 0) count++;
        }

        return count;
    }
}