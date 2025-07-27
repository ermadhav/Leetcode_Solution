class Solution {
    public int findNthDigit(int n) {
        int len = 1; // Current digit length (1 for 1-9, 2 for 10-99, etc.)
        long count = 9; // Number of integers with 'len' digits
        long start = 1; // Starting number with current digit length

        // Determine the digit length group where the nth digit lies
        while (n > len * count) {
            n -= len * count; // Move past this group
            len++; // Go to the next digit length
            count *= 10; // 10 times more numbers in next group
            start *= 10; // First number of the next group
        }

        // Find the actual number that contains the nth digit
        long num = start + (n - 1) / len;

        // Find the digit within that number
        return String.valueOf(num).charAt((n - 1) % len) - '0';
    }
}