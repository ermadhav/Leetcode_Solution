class Solution {
    public boolean checkDivisibility(int n) {
        // Convert the integer to a string to access individual digits
        String s = Integer.toString(n);

        // Initialize digit sum and product
        int sum = 0;
        int product = 1;

        // Loop through each character (digit) in the string
        for (int i = 0; i < s.length(); i++) {
            // Convert character to its numeric digit value
            int digit = Character.getNumericValue(s.charAt(i));
            
            // Add digit to sum
            sum += digit;
            
            // Multiply digit to product
            product *= digit;
        }

        // Calculate the total of digit sum and digit product
        int total = sum + product;

        // Return true if n is divisible by the total, false otherwise
        return n % total == 0;
    }
}
