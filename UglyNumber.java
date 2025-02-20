public class UglyNumber {

    public static boolean isUgly(int n) {

        if (n <= 0) return false; // Ugly numbers must be positive
        
        // Divide n by 2, 3, and 5 as much as possible
        int[] factors = {2, 3, 5};

        // Keep dividing n by 2, 3, and 5 as long as it is divisible
        for (int factor : factors) {
            while (n % factor == 0) { // Check divisibility
                n /= factor; // Reduce n by dividing it by the current factor
            }
        }
        
        // If the remaining number is 1, it's an ugly number
        return n == 1;
    }
}
