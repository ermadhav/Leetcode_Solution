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

       // Dono indexes me left or right wala find karo
       int left = Math.min(min, max); 
       int right = Math.max(min, max);

       // Dono ko front or back se remove karne ki deletions
       int front = right + 1;
       int back = nums.length - left;

       // Ek element front se aur ek back se remove karo
       int eachSide = (left+1) + (nums.length-right);

       // Teeno cases me minimum deletions return karo
       return Math.min(eachSide, Math.min(front, back));
    }
}