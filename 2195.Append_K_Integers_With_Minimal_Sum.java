import java.util.*;

class Solution {
    public long minimalKSum(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) seen.add(num); // Track unique nums

        long sum = 0;
        int current = 1;

        while (k > 0) {
            if (!seen.contains(current)) { // If not in nums
                sum += current; // Add to sum
                k--; // Decrease count
            }
            current++; // Check next number
        }

        return sum; // Return total
    }
}
