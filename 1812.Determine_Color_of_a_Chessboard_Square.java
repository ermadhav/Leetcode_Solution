class Solution {
    public boolean squareIsWhite(String coordinates) {
        char column = coordinates.charAt(0); // e.g., 'a'
        char row = coordinates.charAt(1);    // e.g., '1'
        
        int colIndex = column - 'a' + 1; // 'a' = 1, 'b' = 2, ..., 'h' = 8
        int rowIndex = row - '0';        // '1' = 1, ..., '8' = 8

        return (colIndex + rowIndex) % 2 != 0;
    }
}
