class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        // Use two pointers from both ends
        while (left < right) {
            // If characters don't match, try skipping one from either side
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        
        // If no mismatch found, it's already a palindrome
        return true;
    }

    // Helper function to check if substring is a palindrome
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
