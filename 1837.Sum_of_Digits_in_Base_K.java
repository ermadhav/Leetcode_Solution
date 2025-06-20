class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0) {
            sum += n % k;  // Add the last digit in base k
            n /= k;        // Remove the last digit
        }
        return sum;
    }
}
