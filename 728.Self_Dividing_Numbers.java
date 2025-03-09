import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> res = new ArrayList<>();
        // Iterate through all numbers in the given range
        for (int n = left; n <= right; n++)
            // Check if the number is self-dividing
            if (isSelfDividing(n)) res.add(n);
        return res;
    }

    private boolean isSelfDividing(int n) {
        // Iterate through each digit of the number
        for (int x = n; x > 0; x /= 10) {
            int digit = x % 10; // Extract the last digit
            // If digit is 0 or n is not divisible by this digit, return false
            if (digit == 0 || n % digit != 0) return false;
        }
        return true; // If all digits pass, the number is self-dividing
    }
}
