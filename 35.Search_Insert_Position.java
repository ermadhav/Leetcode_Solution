class Solution {
    public int searchInsert(int[] nums, int target) {

        // Traversing Through the Loop
        for(int i=0; i < nums.length; i++){
            // If target is less than or equal to current number, return the index
            if(nums[i] >= target){
                return i;  
            } 
        }
        // If target is greater than all numbers, return the end index   
        return nums.length;
    }
}