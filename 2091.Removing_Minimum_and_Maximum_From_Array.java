class Solution {
    public int minimumDeletions(int[] nums) {

        // used to store the index of min and max
       int min = 0;
       int max = 0;

       // find the max and min index 
       for(int i=1; i<nums.length; i++){
        if(nums[i] < nums[min]){
            min = i;
        }
        if(nums[i] > nums[max]){
            max = i;
        }
       }
       int left = Math.min(min, max);  // Dono indexes me left wala find karo
       int right = Math.max(min, max);
       int front = right + 1;
       int back = nums.length - left;
       int eachSide = (left+1) + (nums.length-right);

       return Math.min(eachSide, Math.min(front, back));
    }
}