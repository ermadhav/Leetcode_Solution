class Solution {
    public int compress(char[] chars) {
        int write = 0;  // This will track where to write in the array
        int count = 1;  // Start with a count of 1
        
        // Loop through the chars array, starting from the second character
        for (int i = 0; i < chars.length; i++) {
            // Check if the current character is the same as the next character
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;  // Increment count for consecutive characters
            } else {
                // Write the current character
                chars[write++] = chars[i];
                
                // If the count is greater than 1, write the count as characters
                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                count = 1;  // Reset count for the next group of characters
            }
        }
        
        return write;  // Return the length of the compressed array
    }
}
