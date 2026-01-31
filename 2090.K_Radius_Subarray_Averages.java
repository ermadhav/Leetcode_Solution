class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n =nums.length;
        int[] ans = new int[n];
        long sum =0;
            if(k == 0) return nums;

        for(int i=0; i<n; i++){
            ans[i] = -1;
        }
        if(2*k+1 > n) return ans;

        for(int i=0; i<n; i++){
            sum += nums[i];
            if(i>=2*k){
                ans[i-k] = (int) (sum/(2*k+1));
                sum -= nums[i-2*k];
            }
        }
        return ans;
    }
}