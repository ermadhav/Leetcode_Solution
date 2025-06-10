class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26]; // Count letters

        for (char c : s.toCharArray()) freq[c - 'a']++; // Build frequency array

        int maxOdd = -1, minEven = Integer.MAX_VALUE;

        for (int f : freq) {
            if (f == 0) continue;           // Skip unused letters
            if (f % 2 == 1) maxOdd = Math.max(maxOdd, f); // Max odd freq
            else minEven = Math.min(minEven, f);          // Min even freq
        }

        // Return difference or 0 if not possible
        return (maxOdd == -1 || minEven == Integer.MAX_VALUE) ? 0 : maxOdd - minEven;
    }
}