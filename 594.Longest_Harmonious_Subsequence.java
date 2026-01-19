class Solution {
    public int findLHS(int[] nums) {

        // Store frequency of each number
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        int longest = 0;

        // Check pairs where difference is exactly 1
        for (int x : freq.keySet()) {
            if (freq.containsKey(x + 1)) {
                // Update longest length
                longest = Math.max(longest, freq.get(x) + freq.get(x + 1));
            }
        }

        // Return result
        return longest;
    }
}
