class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);

        // Kam se kam ek subsequence hoga
        int count =1;

        // Current subsequence ka minimum element
        int start =nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i] - start>k){
                count++;
                start = nums[i];
            }
        }
        return count;
    }
}