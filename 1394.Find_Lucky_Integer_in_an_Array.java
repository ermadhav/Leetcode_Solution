import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLucky(int[] arr) {
        // Create a HashMap to store the frequency of each number
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        int res = -1; // Initialize result to -1 (in case no lucky number is found)

        // Iterate through the map to find lucky integers
        for (int num : freq.keySet()) {
            // Check if the number equals its frequency
            if (num == freq.get(num))
                res = Math.max(res, num); // Update result with the maximum lucky number
        }

        return res; // Return the largest lucky number or -1 if none found
    }
}