import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;  // Difference can't be negative, so return 0 immediately
        
        // Count frequency of each number in the array
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) 
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        
        int count = 0;
        
        // Iterate through unique numbers in the frequency map
        for (int key : freq.keySet()) {
            // If k == 0, count how many numbers appear more than once
            // If k > 0, count pairs where (key + k) exists
            if ((k == 0 && freq.get(key) > 1) || (k > 0 && freq.containsKey(key + k))) {
                count++;
            }
        }
        
        return count;  // Return total count of unique k-diff pairs
    }
}
