class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // Split the sentence into words using space
        String[] words = text.split(" ");
        int count = 0; // Counter for typeable words

        // Check each word in the sentence
        for (String word : words) {
            boolean canType = true; // Assume the word can be typed

            // Check each broken letter
            for (char c : brokenLetters.toCharArray()) {
                // If the word contains a broken letter, mark it as not typeable
                if (word.indexOf(c) != -1) {
                    canType = false;
                    break; // No need to check further, move to next word
                }
            }

            // If the word has no broken letters, increase the counter
            if (canType) {
                count++;
            }
        }

        return count; // Return the number of words that can be typed
    }
}