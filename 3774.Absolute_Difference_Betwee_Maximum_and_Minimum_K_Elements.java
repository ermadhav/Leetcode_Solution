class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int max =0; // store the max 
        int min =0; // sotre the min

        int l = nums.length;

        // get the min from 0 to k
        for(int i=0; i<k; i++){
            min += nums[i];
        }

        // get max from last to till k from the last
        for(int i=l-1; i>l-k-1; i--){
            max += nums[i];
        }

        return Math.abs(max-min);
    }
}