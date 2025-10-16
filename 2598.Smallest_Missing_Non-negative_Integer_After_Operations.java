class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] freq = new int[value];
        
        // Count how many numbers correspond to each remainder mod 'value'
        for (int num : nums) {
            int rem = ((num % value) + value) % value; // handle negatives
            freq[rem]++;
        }

        int mex = 0;
        while (true) {
            int rem = mex % value;
            if (freq[rem] == 0) {
                break;
            }
            freq[rem]--; // use one occurrence
            mex++;
        }

        return mex;
    }
}