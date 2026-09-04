class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int l = nums.length;
        int[] max = new int[l];
        int[] min = new int[l];
        max[0] = nums[0];
        min[l-1] = nums[l-1];
        for(int i=0; i<l; i++){
            max[i] = Math.max(max[i-1], nums[i]);
        }
        for(int i=l-2; i>=0; i--){
            max[i] = Math.min(min[i+1], nums[i]);
        }
        for(int i=0; i<l; i++){
            if(max[i] - min[i] <= k){
                return i;
            }
        }
        return -1;
    }
}