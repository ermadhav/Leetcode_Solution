class Solution {
    public int[] countOppositeParity(int[] nums){
        int[] ans = new int[nums.length];
        int n = nums.length;
        int odd =0;
        int even=0;
        // traverse from right to left
        for(int i=n-1; i>=0; i--){
            // 
            if(nums[i]%2==0){
                ans[i] = odd;
                even++;
            }else{
                ans[i] = even;
                odd++;
            }
        }
        return ans;
    }
}