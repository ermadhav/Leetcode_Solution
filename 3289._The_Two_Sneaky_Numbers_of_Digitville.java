import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        
        // Count how many sneaky numbers exist
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
        }
        
        // Create the result array
        int[] ans = new int[count];
        int index = 0;
        
        // Add the sneaky numbers to the result array
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                ans[index++] = nums[i];
            }
        }
        
        return ans;
    }
}
