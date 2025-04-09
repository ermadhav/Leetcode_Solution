class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // Concatenate the string with itself
        String doubled = s + s;
        
        // Remove the first and the last character
        // This step ensures we don't count the original string itself in the check
        String trimmed = doubled.substring(1, doubled.length() - 1);
        
        // Check if the original string exists in the modified doubled string
        // If it does, it means the original string is made by repeating a substring
        return trimmed.contains(s);
    }
}
