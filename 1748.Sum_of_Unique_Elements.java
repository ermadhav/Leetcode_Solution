class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();       // Seen once
        HashSet<Integer> duplicates = new HashSet<>(); // Seen more than once

        for (int num : nums) {
            if (!seen.add(num))                        // If already seen
                duplicates.add(num);                   // Mark as duplicate
        }

        int ans = 0;
        for (int num : seen) {
            if (!duplicates.contains(num))             // If unique
                ans += num;                            // Add to sum
        }

        return ans;                                    // Return result
    }
}
