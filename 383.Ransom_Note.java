class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // Array to store count of each letter (a-z)

        // Count each character in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // Check if ransomNote can be made using magazine letters
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) { // If letter not available
                return false;          // Can't form ransomNote
            }
            count[c - 'a']--; // Use one occurrence of the letter
        }

        return true; // All letters found, ransomNote can be made
    }
}
