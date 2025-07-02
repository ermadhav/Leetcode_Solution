class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == reverse(reverse(num));
    }

    // Helper method to reverse digits of a number
    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10; // Add last digit to rev
            n /= 10;                 // Remove last digit
        }
        return rev;
    }
}
