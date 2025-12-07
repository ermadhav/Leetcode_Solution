import java.util.Arrays;

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums); // sort the array to simplify counting
        int n = nums.length;
        
        for (int x = 0; x <= n; x++) {
            int count = 0;
            for (int num : nums) {
                if (num >= x) count++; // count numbers >= x
            }
            if (count == x) return x; // x is the special value
        }
        
        return -1; // no valid x found
    }
}
