class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int l = nums.length;

        // max[i] = index 0 se i tak ka maximum element
        int[] max = new int[l];

        // min[i] = index i se last tak ka minimum element
        int[] min = new int[l];

        // Starting values initialize kar rahe hain
        max[0] = nums[0];
        min[l-1] = nums[l-1];

        // Prefix maximum array bana rahe hain
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