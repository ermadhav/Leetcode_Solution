class Solution {
    public int minElement(int[] nums) {
        // Replace each element with sum of its digits
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int num = nums[i];
            while (num > 0) {
                sum += num % 10;  // add last digit
                num /= 10;        // remove last digit
            }
            nums[i] = sum;  // update array with sum of digits
        }
        
        // Find minimum element in the updated array
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;  // return the minimum value
    }
}
