class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result = new int[nums.length];
        int sum =0;
        // calculate sum for first element
        for(int i=0; i<nums.length; i++){
            sum += Math.abs(nums[0]-nums[i]);
        }
        result[0]=sum;
        for(int j=0; j<nums.length; j++){
            result[j] = result[j-1]+(2*j-nums.length)*(nums[j]-nums[j-1]);
        }
        return result;
    }
}