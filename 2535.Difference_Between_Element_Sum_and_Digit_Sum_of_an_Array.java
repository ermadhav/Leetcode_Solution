class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        
        for (int num : nums) {
            elementSum += num;
            
            // Compute digit sum for each number
            int temp = num;
            while (temp > 0) {
                digitSum += temp % 10; // Extract last digit
                temp /= 10; // Remove last digit
            }
        }
        
        return Math.abs(elementSum - digitSum);
    }
}
