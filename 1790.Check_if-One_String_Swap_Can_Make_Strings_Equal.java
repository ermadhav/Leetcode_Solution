class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int first = -1, second = -1;
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (first == -1) {
                    first = i; // Store the first mismatch index
                } else if (second == -1) {
                    second = i; // Store the second mismatch index
                } else {
                    return false; // More than 2 mismatches, swapping won't work
                }
            }
        }

        // If no mismatches, strings are already equal
        if (count == 0) return true;

        // There must be exactly 2 mismatches and they should be swappable
        return count == 2 &&
               s1.charAt(first) == s2.charAt(second) &&
               s1.charAt(second) == s2.charAt(first);
    }
}
