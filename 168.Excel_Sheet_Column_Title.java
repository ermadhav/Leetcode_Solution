class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        // Loop until columnNumber becomes 0
        while (columnNumber > 0) {

            columnNumber--; // Adjusting for 0-based indexing

            // Get the last character (A-Z)
            char ch = (char) ('A' + (columnNumber % 26)); 
            sb.append(ch);
            // Move to the next position in sequence
            columnNumber /= 26;
        }
        // The sb is constructed in reverse order, so reverse it before returning
        return sb.reverse().toString();
    }
}
