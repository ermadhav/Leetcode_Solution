class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int max =0;
        int min =0;
        int l = nums.length;
        for(int i=0; i<k; i++){
            min += nums[i];
        }
        for(int i=l-1; i>l-k-1; i--){
            max += nums[i];
        }
        return Math.abs(max-min);
    }
}