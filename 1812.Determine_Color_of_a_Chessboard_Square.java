class Solution {
    public boolean squareIsWhite(String coordinates) {
        // Convert column ('a'-'h') to 1-8 and row ('1'-'8') to int
        int col = coordinates.charAt(0) - 'a' + 1;
        int row = coordinates.charAt(1) - '0';
        
        // White if (row + col) is odd
        return (col + row) % 2 != 0;
    }
}
