import java.util.*;

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // Step 1: Store all banned numbers in a HashSet for quick lookup
        Set<Integer> bannedSet = new HashSet<>();
        for (int b : banned) {
            bannedSet.add(b); // Add each banned number to the set
        }

        int count = 0; // To count how many valid numbers we can choose
        int sum = 0;   // To keep track of the sum of chosen numbers

        // Step 2: Iterate through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            if (bannedSet.contains(i)) {
                // If the number is banned, skip it
                continue;
            }
            if (sum + i > maxSum) {
                // If adding this number would exceed maxSum, stop
                break;
            }
            // Otherwise, choose this number
            sum += i;  // Add the number to current sum
            count++;   // Increase the count of chosen numbers
        }

        // Step 3: Return the maximum count of numbers we can choose
        return count;
    }
}
