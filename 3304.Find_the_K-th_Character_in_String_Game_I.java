class Solution {
    
    // Main method to start the process with initial string "a"
    public char kthCharacter(int k) {
        return helper("a", k);
    }

    // Recursive helper method to build the string and find the k-th character
    private char helper(String s, int k) {
        // Base case: if the string has at least k characters, return the k-th one
        if (s.length() >= k) return s.charAt(k - 1);

        // Build the next part by shifting each character in s by one in the alphabet
        StringBuilder next = new StringBuilder();
        for (char c : s.toCharArray())
            next.append((char)((c - 'a' + 1) % 26 + 'a')); // wraps from 'z' to 'a'

        // Recursively continue with the extended string
        return helper(s + next, k);
    }
}
