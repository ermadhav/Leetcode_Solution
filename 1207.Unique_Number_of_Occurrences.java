import java.util.HashSet;
import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> occurrenceSet = new HashSet<>();

        // Check if all frequencies are unique
        for (int count : countMap.values()) {
            if (!occurrenceSet.add(count)) {
                return false; // Duplicate frequency found
            }
        }

        return true; // All frequencies are unique
    }
}