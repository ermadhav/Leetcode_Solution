class Solution {
    public char findTheDifference(String s, String t) {
        // Initialize result as 0 (acts like a neutral element for XOR)
        char result = 0;

        // XOR all characters in string s
        for (char c : s.toCharArray()) {
            result ^= c;
        }

        // XOR all characters in string t
        for (char c : t.toCharArray()) {
            result ^= c;
        }

        // After XORing, all matching characters cancel out,
        // and only the extra character in t remains
        return result;
    }
}
