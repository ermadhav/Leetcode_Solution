class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;// Initialize counter to track words with the prefix
        // Iterate through each word in the array
        for (String word : words) {
            // Check if the word starts with the specified prefix
            if (word.startsWith(pref)) {
                count++;// Increment the counter if the condition is true
            }
        }
        return count; // Return the final count of words with the prefix
    }
}