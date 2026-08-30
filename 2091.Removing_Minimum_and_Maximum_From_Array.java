class Solution {
    public int minimumDeletions(int[] nums) {
       int min = 0;
       int max = 0;

       for(int i=1; i<nums.length; i++){
        if(nums[i] < nums[min]){
            min = i;
        }
        if(nums[i] > nums[max]){
            max = i;
        }
       }
       int left = Math.min(min, max);
       int right = Math.max(min, max);
       int front = right + 1;
       int back = nums.length - left;
       int eachSide = (left+1) + (nums.length-right);

       return Math.min(eachSide, Math.min(front, back));
    }
}