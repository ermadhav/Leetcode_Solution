class Solution {
    public boolean isPowerOfThree(int n) {
        // If n is less than or equal to 0, it cannot be a power of three
        if (n <= 0) {
            return false;
        }
        
        // Keep dividing n by 3 while it is divisible by 3
        while (n % 3 == 0) {
            n /= 3; // Reduce n by dividing it by 3
        }
        
        // If n becomes 1, then it is a power of three; otherwise, it's not
        return n == 1;
    }
}
