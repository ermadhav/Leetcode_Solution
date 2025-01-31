class Solution {
    public int maximumValue(String[] strs) {
        int maxVal = 0; // Initialize max value

        for (int i = 0; i < strs.length; i++) {
            int value;
            
            if (strs[i].matches("\\d+")) { // Check if the string contains only digits
                value = Integer.parseInt(strs[i]); // Convert to integer
            } else {
                value = strs[i].length(); // Use the length of the string
            }
            maxVal = Math.max(maxVal, value); // Update max value
        }
        return maxVal;
    }
}
