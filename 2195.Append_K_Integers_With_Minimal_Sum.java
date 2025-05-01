import java.util.*;

class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array
        long sum = 0;
        int prev = 0;

        for (int num : nums) {
            if (num == prev) continue; // Skip duplicates

            int gap = num - prev - 1; // Count of missing numbers between prev and current

            if (gap >= k) {
                // If enough missing numbers to complete k
                long a = prev + 1;
                long b = prev + k;
                sum += (a + b) * k / 2;
                return sum;
            } else {
                // Take all missing numbers in this gap
                long a = prev + 1;
                long b = num - 1;
                sum += (a + b) * gap / 2;
                k -= gap;
                prev = num;
            }
        }

        // If still need more numbers after the last num
        long a = prev + 1;
        long b = prev + k;
        sum += (a + b) * k / 2;

        return sum;
    }
}
