import java.util.Arrays;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int first = nums[0];
        int last = nums[nums.length - 1];
        int ans = 1;
        
        // Loop from min(first, last) down to 1
        for (int i = Math.min(first, last); i >= 1; i--) {
            if (first % i == 0 && last % i == 0) {
                ans = i;
                break;
            }
        }
        
        return ans;
    }
}
