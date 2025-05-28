class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        // XOR all numbers in the array
        for(int num: nums){
            result = result ^ num; // Same numbers cancel out, only single number remains
        }

        return result; // Return the number that appears only once
    }
}
