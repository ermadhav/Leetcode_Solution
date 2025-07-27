import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        // Step 1: Sort the array in ascending order
        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();
        int total = 0, sum = 0;

        // Step 2: Calculate the total sum of the array
        for (int num : nums) total += num;

        // Step 3: Start from the largest element and keep adding to result
        for (int i = nums.length - 1; i >= 0; i--) {
            result.add(nums[i]);
            sum += nums[i];

            // Step 4: Stop when picked sum > remaining sum
            if (sum > total - sum) break;
        }

        // Step 5: Return the result list (already in non-increasing order)
        return result;
    }
}