class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128]; // frequency array
        for (char c : s.toCharArray()) count[c]++; 
        
        int length = 0;
        for (int c : count) length += (c / 2) * 2; // add pairs
        
        return length < s.length() ? length + 1 : length; // add center if possible
    }
}
