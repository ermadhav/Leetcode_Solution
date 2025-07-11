class Solution {
    public int firstUniqChar(String s) {
         int[] freq = new int[26]; // for 'a' to 'z'

        // Step 1: Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 2: Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // Step 3: If no non-repeating character
        return -1;
    }
}