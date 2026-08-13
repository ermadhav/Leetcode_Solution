class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if (num % 2 == 0) {

                // OR the Even no. with ans
                ans = ans | num;
            }
        }
        return ans; 
    }
}