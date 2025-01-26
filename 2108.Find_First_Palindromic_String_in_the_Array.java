class Solution {
    public String firstPalindrome(String[] words) {
        // Iterate through each word in the array
        for (String word : words) {
            // Check if the current word is a palindrome
            if (isPalindrome(word)) {
                // If a palindrome is found, return it
                return word;
            }
        }
        // If no palindromic word is found, return an empty string
        return "";
    }

    // Helper method to check if a given string is a palindrome
    private boolean isPalindrome(String word) {
        int left = 0; // Pointer to the start of the string
        int right = word.length() - 1; // Pointer to the end of the string
        
        // Compare characters from both ends of the string
        while (left < right) {
            // If characters don't match, it's not a palindrome
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            // Move the pointers closer to the center
            left++;
            right--;
        }
        // If all characters match, the string is a palindrome
        return true;
    }
}
