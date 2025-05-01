import java.util.*;

class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int prev = 0;

        for (int num : nums) {
            if (num == prev) continue; // skip duplicates

            int gap = num - prev - 1; // how many missing numbers between prev and num

            if (gap >= k) {
                // we can take all k missing numbers here
                sum += (long)(prev + 1 + prev + k) * k / 2;
                return sum;
            } else {
                // take all numbers in this gap
                sum += (long)(prev + 1 + num - 1) * gap / 2;
                k -= gap;
                prev = num;
            }
        }

        // If we still need to take more numbers after the largest in nums
        sum += (long)(prev + 1 + prev + k) * k / 2;

        return sum;
    }
}
