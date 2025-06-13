class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int original = x;
        int sum = 0;

        // Special case: if x == 0, sum will be 0, return -1 immediately
        if (x == 0) {
            return -1;
        }

        // Calculate sum of digits
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        // Check divisibility by sum of digits
        if (original % sum == 0) {
            return sum;
        } else {
            return -1;
        }
    }
}
