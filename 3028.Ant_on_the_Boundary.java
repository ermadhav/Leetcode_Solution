class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;  // Boundary par kitni baar wapas aaya
        int position = 0; // Ant ki current position
        for(int i=0; i<nums.length; i++){
            position += nums[i];
            if(position == 0){
                count++;
            }
        }
        return count;
    }
}