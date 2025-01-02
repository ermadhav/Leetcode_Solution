class Solution {
    public int searchInsert(int[] nums, int target) {

        // Traversing Through the Loop
        for(int i=0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;  // if 
            } 
        }   
        return nums.length;
    }
}