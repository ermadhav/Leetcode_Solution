class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        // Extract the column (letter) and row (number) characters from the first coordinate
        char column1 = coordinate1.charAt(0); 
        char row1 = coordinate1.charAt(1);    
        
        // Convert column to index (a -> 1, b -> 2, ..., h -> 8)
        int colIndex1 = column1 - 'a' + 1; 
        
        // Convert row character to integer (e.g., '1' -> 1, '8' -> 8)
        int rowIndex1 = row1 - '0';        

        // Determine the color of the square: true if white, false if black
        boolean ans1 = (colIndex1 + rowIndex1) % 2 != 0;

        // Repeat the same steps for the second coordinate
        char column2 = coordinate2.charAt(0); 
        char row2 = coordinate2.charAt(1);    
        
        int colIndex2 = column2 - 'a' + 1; 
        int rowIndex2 = row2 - '0';        

        boolean ans2 = (colIndex2 + rowIndex2) % 2 != 0;

        // Return true if both squares have the same color, otherwise false
        return ans1 == ans2;
    }
}
