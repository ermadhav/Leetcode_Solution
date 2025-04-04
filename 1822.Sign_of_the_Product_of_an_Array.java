class Solution {
    public int arraySign(int[] nums) {
        int count = 0; // Variable to count the number of negative numbers
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) { // Check if the number is negative
                count++; // Increment count if the number is negative
            } 
            if(nums[i] == 0) return 0; // If any number is 0, the product is 0
        }
        
        // If count of negative numbers is even, return 1 (positive product)
        if(count % 2 == 0) {
            return 1;
        } 
        // If count of negative numbers is odd, return -1 (negative product)
        else {
            return -1;
        }
    }
}
