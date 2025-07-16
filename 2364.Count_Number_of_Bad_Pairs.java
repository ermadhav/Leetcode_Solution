import java.util.HashMap;
import java.util.Map;

class Solution {
    public long countBadPairs(int[] nums) {
        // HashMap to store frequency of (nums[i] - i)
        Map<Integer, Long> freqMap = new HashMap<>();
        
        // This will store the total number of "good" pairs
        long goodPairs = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Compute the key as (nums[i] - i)
            int key = nums[i] - i;

            // If this key has occurred before, add its frequency to goodPairs
            long count = freqMap.getOrDefault(key, 0L);
            goodPairs += count;

            // Update the frequency of this key in the map
            freqMap.put(key, count + 1);
        }

        // Total number of pairs = n * (n - 1) / 2
        long totalPairs = (long) nums.length * (nums.length - 1) / 2;

        // Bad pairs = total pairs - good pairs
        return totalPairs - goodPairs;
    }
}
