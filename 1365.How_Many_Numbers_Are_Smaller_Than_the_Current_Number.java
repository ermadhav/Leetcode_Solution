class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];   // frequency of numbers
        int[] result = new int[nums.length];

        // count frequency of each number
        for (int num : nums) count[num]++;

        // prefix sum → count[i] = how many numbers ≤ i
        for (int i = 1; i < 101; i++) count[i] += count[i - 1];

        // for each number, get how many are smaller
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] == 0 ? 0 : count[nums[i] - 1];
        }
        return result;
    }
}
