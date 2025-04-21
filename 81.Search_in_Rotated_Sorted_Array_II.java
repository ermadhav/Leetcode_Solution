class Solution {
    public boolean search(int[] nums, int target) {
        boolean ans = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                ans = true;
            }
        }
        return ans;
    }
}