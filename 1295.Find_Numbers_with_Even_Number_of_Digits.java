class Solution {
    public int findNumbers(int[] nums) {
        
        int count =0; // stores cout of no. have even digits

        for(int i=0; i<nums.length; i++){

            // no. of digits in curr no.
            int digits =0;
            while(nums[i] != 0){

                // remove the last digit
                nums[i] = nums[i]/10;
                digits++; // incrs the count
            }

            // if digit is even icrs the count
            if(digits%2 == 0){
                count++;
            }
        }
        
        return count;
    }
}