class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Split the input string `s` into words by spaces
        String[] words = s.split(" ");
        
        // If the number of words doesn't match the number of characters in the pattern, return false
        if (pattern.length() != words.length) return false;
        
        // Create a map to track the relationship between pattern characters and words
        Map map = new HashMap();
        
        // Loop through each character in the pattern and corresponding word
        for (int i = 0; i < pattern.length(); i++) {
            // Check if the current character and word are mapped correctly
            if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(words[i], i)))
                return false;  // If not, return false
        }
        
        // If everything is consistent, return true
        return true;
    }
}
