class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1; // Convert character to corresponding number
            result = result * 26 + value; // Update result based on place value
        }
        return result;
    }
}
