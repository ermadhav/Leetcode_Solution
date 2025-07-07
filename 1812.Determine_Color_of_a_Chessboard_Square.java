class Solution {
    public boolean squareIsWhite(String coordinates) {
        char column = coordinates.charAt(0); 
        char row = coordinates.charAt(1);    
        
        int colIndex = column - 'a' + 1; 
        int rowIndex = row - '0';        

        return (colIndex + rowIndex) % 2 != 0;
    }
}
