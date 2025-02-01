class Solution {
    public String convert(String s, int numRows) {
        // If there's only one row, no zigzag pattern, just return the original string
        if (numRows == 1) {
            return s;
        }
        
        // StringBuilder to store the final zigzag string
        StringBuilder answer = new StringBuilder();
        int n = s.length(); // Length of the input string
        int diff = 2 * (numRows - 1); // The full cycle length
        int diagonalDiff = diff; // This will be used for middle rows (diagonal distance)
        int secondIndex; // To store the index of the diagonal character
        int index; // To keep track of the current character index in the string

        // Loop through each row from 0 to numRows-1
        for (int i = 0; i < numRows; i++) {
            index = i; // Start at the current row

            // Loop to add characters for the current row, skipping `diff` characters each time
            while (index < n) {
                answer.append(s.charAt(index)); // Add the character at the current index to the result

                // If we're in a middle row (not the first or last row)
                if (i != 0 && i != numRows - 1) {
                    diagonalDiff = diff - 2 * i; // Calculate the diagonal distance for middle rows
                    secondIndex = index + diagonalDiff; // Find the second diagonal character

                    // If the second diagonal character exists, add it to the result
                    if (secondIndex < n) {
                        answer.append(s.charAt(secondIndex));
                    }
                }

                // Move to the next character in the current row's cycle
                index += diff;
            }
        }
        
        // Return the final zigzagged string
        return answer.toString();
    }
}
