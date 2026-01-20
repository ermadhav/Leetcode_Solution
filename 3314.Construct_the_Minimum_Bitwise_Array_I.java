class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();          // size of input list
        int[] ans = new int[n];       // result array

        for (int i = 0; i < n; i++) {
            int val = nums.get(i);    // get current number from list

            // check if val is of form 111...111 (all bits are 1)
            if ((val & (val + 1)) == 0) {
                ans[i] = val >> 1;    // minimum x such that x | (x+1) = val
            } else {
                ans[i] = -1;          // not possible
            }
        }
        return ans;                   // return result
    }
}
