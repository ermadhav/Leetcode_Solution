class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int sum =0;
            for(int j=0; j<nums.length; j++){
            sum += Math.abs(nums[i]-nums[j]);
            result[i] = sum;
            }
        }
        return result;
    }
}