class Solution {
    public int findNonMinOrMax(int[] nums) {
        // Sorting the array using Bubble Sort
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){// If the current number is greater than the next
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }if(nums.length == 2 || nums.length == 1){
            return -1;
        }else if(nums.length % 2 == 0){
            return nums[nums.length/2];
        }else{
            int num = Math.round(nums.length/2);
            return nums[num];
        }
    }
}