class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;// Initialize counter to track words with the prefix
        // Iterate through each word in the array
        for (String word : words) {
            // Check if the word starts with the specified prefix
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
