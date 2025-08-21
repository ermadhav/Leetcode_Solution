class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; // Different lengths → not anagram

        int[] count = new int[26]; // Count letters a-z
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // Add char from s
            count[t.charAt(i) - 'a']--; // Subtract char from t
        }

        for (int c : count) if (c != 0) return false; // Non-zero → not anagram
        return true; // All counts zero → anagram
    }
}
