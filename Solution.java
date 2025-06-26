public class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) return false; // If base-3 digit is 2, can't use distinct powers
            n /= 3;                       // Move to next base-3 digit
        }
        return true; // All digits are 0 or 1 → valid sum of distinct powers of 3
    }
}
