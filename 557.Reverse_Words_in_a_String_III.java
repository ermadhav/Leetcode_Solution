class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");  // Split string into words
        StringBuilder result = new StringBuilder();  // To build the final result

        for (int i = 0; i < words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse());  // Reverse each word
            if (i < words.length - 1) {
                result.append(" ");  // Add space between words
            }
        }

        return result.toString();  // Return the final string
    }
}
