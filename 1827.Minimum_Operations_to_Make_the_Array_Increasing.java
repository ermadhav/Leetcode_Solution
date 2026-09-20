class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        if(nums.length == 1) return 0;
        // if curr > next elem
        for(int i=1; i<nums.length; i++){
            // new value
            if(nums[i] <= nums[i-1]){
                int val=nums[i-1]+1;
                // calculating how many increament needed
                ans +=val-nums[i];
                nums[i] = val;
            }
        }
        return ans;
    }
}