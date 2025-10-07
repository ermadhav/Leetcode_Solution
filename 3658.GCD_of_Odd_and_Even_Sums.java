class Solution {

    // Function to calculate GCD using Euclidean algorithm
    private static int gcd(int a, int b) {
        if (b == 0)  // Base case: when remainder becomes 0
            return a;
        return gcd(b, a % b);  // Recursive step
    }

    // Function to find GCD of sum of odd and even numbers till n
    public static int findGCD(int n) {
        int sumOdd = n * n;         // Sum of first n odd numbers = n²
        int sumEven = n * (n + 1);  // Sum of first n even numbers = n(n + 1)
        return gcd(sumOdd, sumEven);
    }

    // Public method to return GCD of odd and even sums
    public int gcdOfOddEvenSums(int n) {
        return findGCD(n);  // Return the result
    }
}
