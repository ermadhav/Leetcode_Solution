class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int original = x;  // Store original value
        int sum = 0;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        // If sum is zero (which can happen if x == 0), avoid division by zero
        if (sum == 0) {
            return -1;  // Not a Harshad number
        }

        // Check divisibility
        if (original % sum == 0) {
            return sum;
        } else {
            return -1;
        }
    }
}
