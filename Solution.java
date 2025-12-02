import java.util.Arrays;

public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        Arrays.sort(nums);  // smallest element at nums[0]

        int sum = 0;
        for (int x : nums) sum += x;

        return k % 2 == 1 ? sum - 2 * nums[0] : sum;
    }
}
