class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        // Copy and sort the array
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        // Map to store top k elements and their counts
        Map<Integer, Integer> map = new HashMap<>();

        // Take the largest k elements from sorted array
        for (int i = nums.length - k; i < nums.length; i++) {
            map.put(sorted[i], map.getOrDefault(sorted[i], 0) + 1);
        }

        // Result array
        int[] res = new int[k];
        int i = 0;

        // Build subsequence in original order
        for (int n : nums) {
            if (map.getOrDefault(n, 0) > 0) {
                res[i++] = n;
                map.put(n, map.get(n) - 1);
            }
        }

        return res;
    }
}
