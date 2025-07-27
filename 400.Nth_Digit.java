class Solution {
    public int findNthDigit(int n) {
        int number = 1;  // Start from number 1
        StringBuilder sequence = new StringBuilder();  // To build the sequence as a string

        // Keep appending numbers to the sequence until it has at least n digits
        while (sequence.length() < n) {
            sequence.append(number);  // Add the current number to the sequence
            number++;                 // Move to the next number
        }

        // Return the nth digit as an integer (n - 1 because index starts at 0)
        return sequence.charAt(n - 1) - '0';
    }
}