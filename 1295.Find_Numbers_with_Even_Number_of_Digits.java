class Solution {
    public int findNumbers(int[] nums) {
        int digits =0;
        int count =0;
        for(int i=0; i<nums.length; i++){
            while(nums[i] != 0){
                nums[i] = nums[i]/10;
                digits++;
            }
            if(digits%2 == 0){
                count++;
            }
        }
        
        return count;
    }
}