class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int original = x;  // Store original value to use for divisibility check
        int sum = 0;       // Initialize sum of digits to 0

        // Calculate sum of digits of x
        while (x > 0) {
            sum += x % 10; // Add last digit to sum
            x /= 10;       // Remove last digit
        }

        // Check if original number is divisible by sum of its digits
        if (original % sum == 0) {
            return sum;    // Return sum if x is a Harshad number
        } else {
            return -1;     // Otherwise return -1
        }
    }
}
