class Solution {
    public int findNonMinOrMax(int[] nums) {
        // Sorting the array using Bubble Sort
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){// If the current number is greater than the next

                     // Swap the elements
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            // If there are only 1 or 2 elements, return -1 as there is no "non-min or non-max" element
        }if(nums.length == 2 || nums.length == 1){
            return -1;
            // If the array has an even number of elements, return the middle element
        }else if(nums.length % 2 == 0){
            return nums[nums.length/2];
            // If the array has an odd number of elements, return the element just after the middle
        }else{
            int num = Math.round(nums.length/2);
            return nums[num];
        }
    }
}