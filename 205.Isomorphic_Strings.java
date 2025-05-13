class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Arrays to store last seen positions of characters
        int[] indexS = new int[200];
        int[] indexT = new int[200];

        // If lengths differ, not isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            // If mapping doesn't match, return false
            if (indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
            }
            // Update last seen positions (use i+1 to avoid default 0)
            indexS[s.charAt(i)] = i + 1;
            indexT[t.charAt(i)] = i + 1;
        }

        // All characters match consistently
        return true;
    }
}
