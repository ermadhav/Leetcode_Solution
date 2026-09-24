// Approach --> 1

// class Solution {
//     public int smallestIndex(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             int sum = digitSum(nums[i]);
//             if (sum == i) {
//                 return i; // Return first match (smallest index)
//             }
//         }
//         return -1; // No match found
//     }

//     private int digitSum(int num) {
//         int sum = 0;
//         while (num > 0) {
//             sum += num % 10; // Add last digit
//             num /= 10;       // Remove last digit
//         }
//         return sum;
//     }
// }

// Approach --> 2

class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            int sum = 0;
            // Calculate sum of digits
            while(temp>0){
                sum += temp % 10;
                temp /= 10;
            }
            if(sum == i){
                return i;
            }
        }
        return -1;
    }
}