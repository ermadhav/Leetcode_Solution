class Solution {
    public int minOperations(int[] nums, int k) {
        int count =0; // no. of element which are less then k

        // iterate over nums so that we can find the no. which are less than k
        for(int i=0;  i<nums.length; i++){
            if(nums[i] < k){
                count++;
            }
        }
        return count;
    }
}