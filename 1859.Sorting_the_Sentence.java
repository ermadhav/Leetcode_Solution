class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {
            int len = word.length();
            // Get the position (last character of the word), then convert to 0-based index
            int pos = Character.getNumericValue(word.charAt(len - 1)) - 1;
            // Remove the digit and store the word at the correct position
            result[pos] = word.substring(0, len - 1);
        }

        // Join the words with a single space
        return String.join(" ", result);
    }
}
