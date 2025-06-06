class Solution {
    public boolean checkIfPangram(String sentence) {
        // If the sentence is shorter than 26 characters, it can't be a pangram
        if (sentence.length() < 26) {
            return false;
        }

        // Boolean array to track whether each letter a-z has been seen
        boolean[] seen = new boolean[26];

        // Iterate over each character in the sentence
        for (char c : sentence.toCharArray()) {
            // Mark the letter as seen by setting the corresponding index to true
            seen[c - 'a'] = true;
        }

        // Check if all letters from a to z have been seen
        for (boolean letterSeen : seen) {
            // If any letter was not seen, return false
            if (!letterSeen) {
                return false;
            }
        }

        // If all letters were seen at least once, return true
        return true;
    }
}