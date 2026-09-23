class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum =0;
        for(int i=0; i<nums.length; i++){
            totalSum += nums[i];
        }
        int target = totalSum-x;
        int left =0;
        int sum=0;
        int maxLen=-1;
        // finding longest subarray where sum == target
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            while(i<left && sum>target){
                sum -= nums[left];
            }
            if(sum== target){
                maxLen = Math.max(maxLen, right-left+1);
            }   
        }
        if(maxLen == -1){
            return -1;
        }
        return nums.length-maxLen;
    }
}