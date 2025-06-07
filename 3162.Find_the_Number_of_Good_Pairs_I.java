import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        // Build a frequency map of nums2[j] * k
        for (int num : nums2) {
            int product = num * k;
            map.put(product, map.getOrDefault(product, 0) + 1);
        }
        int count = 0;
        // For each element in nums1, check how many values from nums2 * k divide it
        for (int a : nums1) {
            for (int b : map.keySet()) {
                if (a % b == 0) {
                    count += map.get(b); // Add number of such valid b's
                }
            }
        }
        return count;
    }
}