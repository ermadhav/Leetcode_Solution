class Solution {

    public String longestCommonPrefix(String[] strs) {

        // If the input array is empty or null, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }    

        // Start with the first string as the initial prefix
        String prefix = strs[0]; 
        // Loop through the rest of the strings in the array

        for (int i = 1; i < strs.length; i++) {
            // Keep reducing the prefix until it is a prefix of strs[i]
            while (strs[i].indexOf(prefix) != 0) { 
                // Shorten the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1); 
                
                // If the prefix becomes empty, return an empty string (no common prefix)
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        // Return the longest common prefix found
        return prefix;
    }
}
