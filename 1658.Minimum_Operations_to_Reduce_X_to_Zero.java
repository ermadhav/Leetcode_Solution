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
        // finding the subarray with sum using sliding window
        for(int i=0; i<nums.length; i++){
            // add curr element to window
            sum += nums[i];
            // if sum becomes > target decrease the window
            while(left<=i && sum>target){
                sum -= nums[left];
                left++;
            }
            // if found then update the len with maximum
            if(sum== target){
                maxLen = Math.max(maxLen, i-left+1);
            }   
        }
        if(maxLen == -1){
            return -1;
        }
        return nums.length-maxLen;
    }
}