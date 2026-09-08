class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;  
        int position = 0;
        for(int i=0; i<nums.length; i++){
            position += nums[i];
            if(position == 0){
                count++;
            }
        }
        return count;
    }
}