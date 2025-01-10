class Solution {
    public boolean areNumbersAscending(String s) {
        String[] tokens = s.split(" "); // Split the sentence into tokens
        int lastNumber = -1; // Initialize the last number to an invalid value (e.g., -1)

        for (String token : tokens) { // Correctly iterate over the tokens
            // Check if the token is a number
            if (Character.isDigit(token.charAt(0))) {
                int currentNumber = Integer.parseInt(token); // Convert the token to a number

                // Check if the current number is strictly greater than the last number
                if (currentNumber <= lastNumber) {
                    return false; // Not strictly increasing
                }

                lastNumber = currentNumber; // Update the last number
            }
        }

        return true; // All numbers are strictly increasing
    }
}
