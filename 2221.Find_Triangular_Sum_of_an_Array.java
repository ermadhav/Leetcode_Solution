class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length; // length of array
        while (n > 1) { // repeat until one element left
            for (int i = 0; i < n - 1; i++) {
                // replace each element with sum of it and next element % 10
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            n--; // size reduces by 1 each step
        }
        return nums[0]; // final single element is the answer
    }
}
