class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int left =0;
        int ans =0;

        // Agar current range ka difference 2*k se zyada hai, toh left pointer ko aage badhao

        for(int i=0; i<nums.length; i++){
            while(nums[i] - nums[left] > 2*k){
                left++;
            }
            ans = Math.max(ans, i-left+1);
        }
        return ans;
    }
}