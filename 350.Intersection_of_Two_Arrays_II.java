import java.util.ArrayList;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Store frequency of each number in nums1
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1)
            map.put(n, map.getOrDefault(n, 0) + 1);

        // Store intersection elements
        List<Integer> list = new ArrayList<>();
        for (int n : nums2) {
            // If element exists in map (nums1) and count > 0
            if (map.getOrDefault(n, 0) > 0) {
                list.add(n); // Add to result
                map.put(n, map.get(n) - 1); // Decrease count
            }
        }

        // Convert list to int[] and return
        return list.stream().mapToInt(i -> i).toArray();
    }
}
