class Solution {
    public long sumDigitDifferences(int[] nums) {
        int n = nums.length;
        int len = String.valueOf(nums[0]).length();
        long total = 0;

        for (int pos = 0; pos < len; pos++) {
            int[] count = new int[10];
            for (int num : nums) {
                int digit = String.valueOf(num).charAt(pos) - '0';
                count[digit]++;
            }
            for (int i = 0; i < 10; i++) {
                for (int j = i + 1; j < 10; j++) {
                    total += (long) count[i] * count[j];
                }
            }
        }

        return total;
    }
}