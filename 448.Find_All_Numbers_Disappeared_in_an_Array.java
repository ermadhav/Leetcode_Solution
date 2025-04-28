import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        // Step 1: Mark numbers that appear by negating the value at the index
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] > 0) {
                nums[num - 1] = -nums[num - 1];
            }
        }
        
        // Step 2: Collect missing numbers (positive values mean missing)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}
